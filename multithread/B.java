package multithread;

public class B extends A{
       void m1(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        B b1=new B();
        b1.m1();
    }
}
