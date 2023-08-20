package multithread;

class DemonThread extends  Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("demon thread");
        }
        else{
            System.out.println("user thread");
        }
    }
}
public class TestDemon {
    public static void main(String[] args) {
        DemonThread t1=new DemonThread();
        DemonThread t2=new DemonThread();
        DemonThread t3=new DemonThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();

        t3.start();

    }

}
