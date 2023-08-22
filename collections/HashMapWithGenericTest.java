package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapWithGenericTest {
    public static void main(String[] args) {
        Customer c1=new Customer(12,"tarun");
        Customer c2=new Customer(10,"arun");
        Customer c3=new Customer(11,"varun");
        Map<Integer,Customer> map=new HashMap<>();
        map.put(10,c1);
        map.put(6,c2);
        map.put(0,c3);
        map.entrySet().stream().sorted((x,y)->x.getValue().cname.compareTo(y.getValue().cname)).forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
//        for(Map.Entry<Integer,Customer> m:map.entrySet())
//            System.out.println(m.getKey()+" "+m.getValue());
//        map.entrySet().stream().
//        map.forEach((i,j)-> System.out.println(i+" "+j));
//        System.out.println("using entryset");
//        System.out.println(map);
//        for(Map.Entry<Integer,String> m:map.entrySet())
//            System.out.println(m.getKey()+" "+m.getValue());
//        System.out.println("using comparingByKey()");
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//        System.out.println("using comparingByKey(comparator.reverseOrder()");
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//        System.out.println("using comaringByValue()");
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//        System.out.println("using comaringByValue(comparator.reverseOrder)");
//        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);


    }
}
