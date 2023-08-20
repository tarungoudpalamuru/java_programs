package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylisttest1 {
    public static void main(String[] args) {
        Student s1=new Student(1,"tarun",45);
        Student s2=new Student(2,"arun",43);
        Student s3=new Student(3,"varun",42);
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
//        for(Student s:al){
//            System.out.println(s);
//        }
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student s4= (Student) itr.next();
            System.out.println("sno"+s4.sno+"\tsname"+s4.sname+"\trollno"+s4.rollno);
        }
    }

}
