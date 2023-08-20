package collections;

import java.util.*;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
//        set.add(new String("tarun"));
//        set.add(new String("arun"));
//        set.add(new String("tarun"));
        set.add("tarun");
        set.add("tarun");
        set.add("arun");
        System.out.println(set);



        set.remove("arun");
        Iterator<String > itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

//        for(String s:set)
//            System.out.println(s);

    }

}
