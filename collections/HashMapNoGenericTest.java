package collections;

import java.util.*;


public class HashMapNoGenericTest {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(1,"tarun");
        map.put(2,"dsp");
        map.put(3,"sai");
        Set set=map.entrySet();
        Iterator itr=set.iterator();
//        while(itr.hasNext())
//            Map.Entry entry=(Map.Entry)itr.next();
//        System.out.println(entry.getKey()+" "+entry.getValue());


    }
}
