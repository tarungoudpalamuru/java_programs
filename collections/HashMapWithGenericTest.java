package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapWithGenericTest {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(10,"john");
        map.put(6,"roy");
        map.put(5,"peter");
        System.out.println("using entryset");
        for(Map.Entry<Integer,String> m:map.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());
        System.out.println("using comparingByKey()");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("using comparingByKey(comparator.reverseOrder()");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("using comaringByValue()");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("using comaringByValue(comparator.reverseOrder)");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);


    }
}
