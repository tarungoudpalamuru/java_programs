package collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Student s1=new Student(46,"tarun",1601);
        Student s2=new Student(44,"arun",1604);
        Student s3=new Student(45,"varun",1602);
        TreeMap<Integer,Student> map=new TreeMap<>();
        map.put(12,s1);
        map.put(1,s2);
        map.put(0,s3);
//        Comparator<Student> comp=(x,y)->x.sname.compareTo(y.sname);
//        map.entrySet().stream().sorted((x,y)->x.getValue().sname.compareTo(y.getValue().sname)).forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

        System.out.println("using entryset");
        for(Map.Entry<Integer,Student> m:map.entrySet())
            System.out.println(m.getKey()+" "+m.getValue());
    }
}
