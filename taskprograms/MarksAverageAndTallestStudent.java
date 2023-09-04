package taskprograms;

import collections.Student;

import java.util.*;
import java.util.stream.Collectors;

public class MarksAverageAndTallestStudent {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "tarun", 78, 145);
        Student1 s2 = new Student1(2, "sai", 74, 150);
        Student1 s3 = new Student1(3, "mani", 55, 177);
        List<Student1> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        //tallest person
        System.out.println("tallest person " + list.get(0).sname + " with height " + list.get(0).height);
        System.out.println("shortest  person " + list.get(0).sname + " with height " + list.get(0).height);
        int sum = 0;
        //marks categories
        for (Student1 obj : list) {
            sum = sum + obj.marks;
            if (obj.marks >= 60) {
                System.out.println("marks greater than or equals to 60" + obj.sname + " marks=" + obj.marks);
            } else {
                System.out.println("marks less than or equals to 60" + obj.sname + " marks=" + obj.marks);
            }
        }
        //average marks
        System.out.println("average marks=" + sum / list.size());
        //using java 8 tallest person
        Map<String,List> map=new HashMap<>();
        for(Student1 obj:list){
            if(obj.height>=150){
                map.put("tallest",(list.stream().filter(x->x.height>=150).collect(Collectors.toList())));
            }
            else{
                map.put("short",(list.stream().filter(x->x.height<150).collect(Collectors.toList())));
            }
        }

        map.put("tallest and shortest",list.stream().filter(x->x.height>=150).toList());
       // map.put("tall",(list.stream().filter(x->x.height>=150).collect(Collectors.toList())));
        System.out.println(map);
        System.out.println( "average marsk"+list.stream().mapToInt(x->x.marks).average());

    }
}
