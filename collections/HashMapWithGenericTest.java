package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithGenericTest {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"john");
        map.put(6,"roy");
        map.put(5,"peter");
        for(Map.Entry m:map.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());

    }
}
