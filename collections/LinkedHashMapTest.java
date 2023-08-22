package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Student s1=new Student(46,"tarun",1601);
        Student s2=new Student(44,"arun",1604);
        Student s3=new Student(45,"varun",1602);
        Map<Integer,Student> map=new LinkedHashMap<>();
        map.put(12,s1);
        map.put(1,s2);
        map.put(0,s3);
//        map.put(10,"john");
//        map.put(6,"roy");
//        map.put(5,"peter");
//        map.put(null,"peter");
//        map.put(null,"peter");
        System.out.println("using entryset");
        for(Map.Entry<Integer,Student> m:map.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());

    }
}
