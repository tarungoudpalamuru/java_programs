package collections;

import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Student s1=new Student(46,"a",1601);
        Student s2=new Student(44,"c",1604);
        Student s3=new Student(45,"b",1602);
        Queue<Student> que=new PriorityQueue<>();
        que.add(s1);
        que.add(s2);
        que.add(s3);
        System.out.println("before");
        Iterator<Student> itr=que.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println("after");
        que.remove();
        Iterator<Student> itr1=que.iterator();
        while(itr1.hasNext())
            System.out.println(itr1.next());
    }
}
