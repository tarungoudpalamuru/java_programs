package multithread;
class Simple1 extends Thread{
    public void run(){
        System.out.println("simple1 run");
    }
}
class Simple2 extends Thread{
    public void run(){
        System.out.println("simple2 run");
    }
}
public class Multitasking {
    public static void main(String[] args) {
        Simple1 s1=new Simple1();
        Simple2 s2=new Simple2();
        s1.start();
        s2.start();


    }
}
