package multithread;

import java.lang.Thread;

class Table {
    synchronized void printTable(int n){
        //synchronized(this){}
        for(int i=1;i<5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(1000);
//                wait(1000);
            }
            catch (InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}
/*class Mythreadtwo extends Thread{
    Table t;
    Mythreadtwo(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThreadThree extends Thread{
    Table t;
    MyThreadThree(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}*/

public class SynchronizedMethod {
    public static void main(String[] args) {
       Table t=new Table();
       //annonymous class
        Thread t1=new Thread(){
            public void run(){
            t.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                t.printTable(100);
            }
        };


//       Mythreadtwo t1=new Mythreadtwo(t);
//       MyThreadThree t2=new MyThreadThree(t);
       t1.start();
       t2.start();



    }
}
