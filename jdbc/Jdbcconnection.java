package jdbc;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.sql.*;

/**
 *
 * @author postgresqltutorial.com
 */
public class Jdbcconnection{
    public static JSONArray convert(ResultSet resultSet) throws Exception {

        JSONArray jsonArray = new JSONArray();

        while (resultSet.next()) {

            int columns = resultSet.getMetaData().getColumnCount();
            JSONObject obj = new JSONObject();

            for (int i = 0; i < columns; i++)
                obj.put(resultSet.getMetaData().getColumnLabel(i + 1).toLowerCase(), resultSet.getObject(i + 1));

            jsonArray.put(obj);
        }
        return jsonArray;
    }

    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "ruegen";
    private final String password = "ruegen";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            Statement statement=conn.createStatement();
            String sql="SELECT * FROM pg_catalog.pg_tables WHERE schemaname != 'pg_catalog' AND schemaname != 'information_schema'";

            ResultSet result = statement.executeQuery(sql);
            JSONArray jsonArray = convert(result);

            System.out.println(jsonArray.toString(2));

            // creating a single nested object grouped by table owners
            JSONObject owners=new JSONObject();
            for(int i=0;i<jsonArray.length();i++){
                String ownerName=jsonArray.getJSONObject(i).get("tableowner").toString();
                JSONObject ownerObject=jsonArray.getJSONObject(i);
                owners.accumulate(ownerName,ownerObject);
            }


            try(FileWriter file=new FileWriter("Tables.json")){
//                System.out.println("Number of Rows Stored in the Json file : "+jsonArray.length());
//                file.write(jsonArray.toString(2));

                System.out.println("Number of owners in the Database : "+owners.length());
                file.write(owners.toString(4));
            }catch (Exception er){
                System.out.println(er.getMessage());
            }

            result.close();
            statement.close();
            conn.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Jdbcconnection app = new Jdbcconnection();
        app.connect();

    }
}

