package collections;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeTest {
    public static void main(String[] args) {
        Student s1=new Student(46,"a",1601);
        Student s2=new Student(44,"c",1604);
        Student s3=new Student(45,"b",1602);
        Queue<Student> queue=new PriorityQueue<>();
        queue.add(s1);
        queue.add(s2);
        queue.add(s3);
        System.out.println("before");
        Iterator<Student> itr=queue.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        queue.poll();
        System.out.println("peek method returns head "+queue.peek());
        System.out.println("after");
        Iterator<Student> itr1=queue.iterator();
        while(itr1.hasNext())
            System.out.println(itr1.next());
    }
}
