package taskprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscendingOrderOfListInJava7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(7);
        System.out.println("sorting the list using bubblesort");
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                if(list.get(j)>list.get(j+1)){
                    int temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
                System.out.println(list);
            }
        }
        System.out.println(list);
    }
}
