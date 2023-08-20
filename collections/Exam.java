package collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

public class Exam {
    public static void main(String[] args) {
//        Set<Integer> set=new LinkedHashSet<>();
//        set.add(10);
//        set.add(15);
//        set.add(20);
//        set.add(25);
//        Iterator<Integer> itr=set.iterator();
//        System.out.println("before remove");
//        while(itr.hasNext())
//            System.out.println(itr.next());
////        for(Integer o:set)
////            System.out.println(o);
//        set.remove(20);
////        for(Integer o:set)
////            System.out.println(o);
//       Iterator<Integer> itr1=set.iterator();
//        System.out.println("after remove");
//        while(itr1.hasNext())
//            System.out.println(itr1.next());
        Set<Employee> set=new TreeSet<>();
        Employee e1=new Employee(12,40000,"tarun");
        Employee e2=new Employee(13,40000,"arun");
        Employee e3=new Employee(14,4000,"varun");
        set.add(e1);
        set.add(e2);
        set.add(e3);
//        Iterator<Employee> itr1=set.iterator();
//        System.out.println("after remove");
//        while(itr1.hasNext())
//            System.out.println(itr1.next());
        for(Employee o:set)
            System.out.println(o.id+" "+o.salary+" "+o.name);
        }
    }

