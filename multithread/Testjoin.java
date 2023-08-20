package multithread;
import java.io.*;
class Testjoinmythread extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            try{
                Thread.sleep(50);
                System.out.println(i+" "+currentThread().getName());
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}
public class Testjoin {
    public static void main(String[] args) {
        Testjoinmythread t1=new Testjoinmythread();
        Testjoinmythread t2=new Testjoinmythread();
        Testjoinmythread t3=new Testjoinmythread();
        System.out.println("thread t1 name "+t1.getName());
        System.out.println("thread t2 name "+t2.getName());
        System.out.println("thread t3 name "+t3.getName());
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
        t3.start();
        try{
            t3.join();
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }

    }
}
