

public class A{
     static void m(int i){
        System.out.println("A"+i);
    }
    public void m3(int x){
        System.out.println("A"+x);
    }

}
class B extends A {
    public static void m(int i){
        System.out.println("B"+i);
    }
    public void m2(int x){
        System.out.println("B"+x);
    }
    public static void main(String [] args){
//        A a=new B();
        A.m(10);
        B b=new B();
        b.m(20);
//        A a1=new A(30);
//        a1.m(10);
//        A a3=new B();
//        a3.m2(50);
        B b2=new B();
        b2.m2(60);
        B b3=new B();
        b3.m3(15);
    }

}
