package Practice;

import  org.json.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonObjectExample {
    public static void main(String[] args) throws JSONException {
        Map<String,String> map=new HashMap<>();
        map.put("1","tarun");
        map.put("12","run");
        map.put("2","arun");
        System.out.println("map"+map);
        JSONObject jsobj=new JSONObject(map);
        jsobj.put("122","namaste");
        JSONArray employeeArray =new JSONArray();
        employeeArray.put("tarungoud");

        System.out.println(jsobj.toString(4));
        try(FileWriter file=new FileWriter("employee.json")){
            jsobj.write(file);

        }
        catch(IOException ie){
            ie.printStackTrace();
        }
        jsobj.put("employee.json","employeeArray");


    }
}
