package multithread;

public class MultitaskingAnonymous extends Thread {
    public static void main(String[] args) {
    // Runnable r=new MultitaskingAnonymous();
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("simple1 run");
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                System.out.println("simple2 run");
            }
        };
        t1.start();
        t2.start();

        Runnable r2=new Runnable(){
            public void run(){
                System.out.println("task two");
            }
        };
    }
}
