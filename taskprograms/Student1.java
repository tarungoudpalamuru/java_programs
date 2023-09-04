package taskprograms;


;

public class Student1 implements Comparable<Student1>  {
    public int sno;
    public String sname;
    public int marks;
    public int height;

    public Student1(int sno, String sname, int marks,int height) {
        this.sno = sno;
        this.sname = sname;
        this.marks = marks;
        this.height=height;

    }



    public int compareTo(Student1 obj){
        return obj.height-height;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                ", height=" + height +
                '}';
    }
}
