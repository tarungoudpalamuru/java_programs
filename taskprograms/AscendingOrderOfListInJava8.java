package taskprograms;

import java.util.*;
import java.util.stream.Collectors;

public class AscendingOrderOfListInJava8 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(1);
        list.add(10);
        System.out.println("before sorting"+list);
        Set<Integer> set=new TreeSet<>(list);
        System.out.println("sorting the list elements by converting to set"+set);
        System.out.println("list.stream().sorted().collect(Collectors.toList())\t"+list.stream().sorted().collect(Collectors.toList()));
        System.out.println("list.stream().sorted((a,b)->Integer.compare(a,b)).toList()\t"+list.stream().sorted((a,b)->Integer.compare(a,b)).toList());
    }
}
