package taskprograms;


import java.util.Comparator;

public class Student1  {
    public int sno;
    public String sname;
    public int marks;

    public Student1(int sno, String sname, int marks) {
        this.sno = sno;
        this.sname = sname;
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "Student1{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int compareTo(Student1 obj){
        return sname.compareTo(obj.sname);
    }
}
