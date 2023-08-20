package collections;

import multithread.A;

import java.util.*;

public class ComparableExample implements Comparable<ComparableExample>{
    public int age;
    public int phone;

    public ComparableExample(int age,int phone){
        this.age=age;
        this.phone=phone;
    }
    @Override
    public int compareTo(ComparableExample o) {
        if(this.phone==o.phone)
        return 0;
        else if (this.phone>o.phone) {
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.age+", "+this.phone;
    }

    public static void main(String[] args) {
        ComparableExample exam1=new ComparableExample(1,2);
        ComparableExample exam2=new ComparableExample(2,1);
        ComparableExample exam3=new ComparableExample(4,3);
        ComparableExample exam4=new ComparableExample(3,2);

        ArrayList<ComparableExample> exam=new ArrayList<>();
        exam.add(exam1);
        exam.add(exam2);
        exam.add(exam3);
        exam.add(exam4);
        Collections.sort(exam);

        Iterator it=exam.iterator();
        for (ComparableExample i:exam) {
            System.out.println(i);
        }
    }
}
