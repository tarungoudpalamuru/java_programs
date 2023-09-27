package jdbc;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;

public class JdbcRowset {
    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");

            JdbcRowSet rowSet= RowSetProvider.newFactory().createJdbcRowSet();

            rowSet.setUrl("jdbc:postgresql://localhost:5432/");
            rowSet.setUsername("ruegen");
            rowSet.setPassword("ruegen");
            rowSet.setCommand("SELECT * FROM pg_catalog.pg_tables WHERE schemaname != 'pg_catalog' AND schemaname != 'information_schema'");
            rowSet.execute();



    }
        catch(Exception e){

        }
}
}
