package collections;

import java.util.Comparator;
import java.util.Map;

public class Student  implements Comparator<Student> {
    public int sno;
    public String sname;
    public int marks;

    public Student(int sno, String sname, int marks) {
        this.sno = sno;
        this.sname = sname;
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                '}';
    }

//    public static Comparator<Map.Entry<String,Student>> nameComparator=(x, y)->x.getValue().sname.compareTo(y.getValue().sname);

    public int compare(Student obj1, Student obj2) {
        return obj1.sname.compareTo(obj2.sname);
    }
}
class Comparingsno implements Comparator<Student> {
    public int compare(Student obj1,Student obj2){
        return obj1.sno-obj2.sno;
    }
}

class Comparingmarks implements Comparator<Student> {
        public int compare(Student obj1, Student obj2) {
            return obj1.marks - obj2.marks;

        }
    }


