package collections;

public class Student  implements Comparable<Student>{
    public int sno;
    public String sname;
    public int rollno;

    Student(int sno, String sname, int rollno) {
        this.sno = sno;
        this.sname = sname;
        this.rollno = rollno;

    }


    public int compareTo(Student o) {
//       // return o.sname.compareTo(sname);
//        if (sno > o.sno)
//            return 1;
//        else if (sno < o.sno)
//            return -1;
//        else
//            return 0;
        return sno-o.sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}

