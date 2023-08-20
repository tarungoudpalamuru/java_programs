package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetTest {
    public static void main(String[] args) {
        Student s1=new Student(45,"a",1601);
        Student s2=new Student(46,"c",1604);
        Student s3=new Student(44,"b",1602);
        Set<Student> set=new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
//        set.add("s1");
//        set.add("s2");
//        set.add("a3");
        Iterator<Student  > itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
