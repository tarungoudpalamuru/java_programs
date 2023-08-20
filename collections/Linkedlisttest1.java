package collections;

import java.util.*;

public class Linkedlisttest1 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("tarun");
        ll.add("varun");
        ll.add("varun");
        ll.add("arun");
        ll.add("arun");
        Collections.sort(ll);
        System.out.println(ll);
//        Iterator<String> itr=ll.descendingIterator();
////        while(itr.hasNext())
////            System.out.println(itr.next());
//        Set<String> set=new HashSet<>(ll);
//        for(String s:set)
//            System.out.println(s);


    }
}
