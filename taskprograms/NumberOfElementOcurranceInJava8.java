package taskprograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfElementOcurranceInJava8 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
//        Map<Integer,Long> map=new LinkedHashMap<>();
//        for(int i=0;i<list.size();i++){
//         //mapping every element as key,no of ocurance as value
//            final int j=list.get(i);
//
//            int finalI= i;
//            map.put(list.get(i),list.stream().filter(x->x.equals(list.get(finalI))).count());
//
//        }
        Map<Integer,Long> result=list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("no of element occurence "+result);
    }
}
