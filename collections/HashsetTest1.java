package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetTest1 {
    public static void main(String[] args) {
        Set <String> set=new HashSet<>();
        set.add("tarun");
        set.add("arun");
        set.add("varun");
        set.add("varun");
        Iterator<String > itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
