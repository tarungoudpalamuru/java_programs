package taskprograms;
import collections.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapOfStudentObjUsingJava8 {
    public static void main(String[] args) {
        Student s1=new Student(46,"tarun",64);
        Student s2=new Student(44,"arun",36);
        Student s3=new Student(45,"varun",40);
        Map<String,Student> map=new HashMap<>();
        map.put("1",s1);
        map.put("2",s2);
        map.put("3",s3);

//        map.entrySet().stream().sorted(Student.nameComparator);

        System.out.println("sorting based on sname");
        map.entrySet().stream().sorted((x,y)->x.getValue().sname.compareTo(y.getValue().sname)).forEach(System.out::println);
        System.out.println("sorting based on marks");
        map.entrySet().stream().sorted((x,y)->x.getValue().marks-y.getValue().marks).forEach(System.out::println);
        System.out.println("sorting based on sno");
        map.entrySet().stream().sorted((x,y)->x.getValue().sno-y.getValue().sno).forEach(System.out::println);

    }
}
