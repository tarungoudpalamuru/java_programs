package taskprograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapOfStudentObjUsingJava7 {
    public static void main(String[] args) {
        Student1 s1=new Student1(4,"tarun",64,176);
        Student1 s2=new Student1(44,"arun",4,171);
        Student1 s3=new Student1(45,"varun",40,181);
        Map<Student1,String> map=new HashMap<>();
        map.put(s1,"1");
        map.put(s2,"2");
        map.put(s3,"3");

        //Sorting using name
        Map<Student1,String> map1=new TreeMap<>(new Comparator<Student1>(){
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.sname.compareTo(o2.sname);
            }

        });
         map1.putAll(map);
        System.out.println("using sname");
        for(Map.Entry<Student1,String> m:map1.entrySet()) {
            System.out.println(m.getValue() + " " + m.getKey());
        }
        //Sorting using Sno
        map1=new TreeMap<>(new Comparator<Student1>(){
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.sno-o2.sno;
            }

        });
        map1.putAll(map);
        System.out.println("using sno");
        for(Map.Entry<Student1,String> m:map1.entrySet())
            System.out.println(m.getValue()+" "+m.getKey());

        //Sorting using age
        map1=new TreeMap<>(new Comparator<Student1>(){
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.marks-o2.marks;
            }
        });
        map1.putAll(map);
        System.out.println("using marks");
        for(Map.Entry<Student1,String> m:map1.entrySet())
            System.out.println(m.getValue()+" "+m.getKey());





    }
}
