package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        Employee e1=new Employee(1,40000,"tarun");
        Employee e2=new Employee(10,40000,"arun");
        Employee e3=new Employee(5,4000,"varun");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        Collections.sort(list);
        Iterator<Employee> itr=list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }
}
