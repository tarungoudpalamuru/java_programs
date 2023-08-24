package taskprograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NumberOfElementOcurranceInJava8 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        Map<Integer,Long> map=new LinkedHashMap<>();
        for(int i=0;i<list.size();i++){
         //mapping every element as key,no of ocurance as value
            int finalI = i;
            map.put(list.get(i),list.stream().filter(x->x.equals(list.get(finalI))).count());
        }
        System.out.println("no of element occurence "+map);


    }
}
