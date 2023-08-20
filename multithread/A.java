package multithread;

public class A implements Runnable{
    public void run() {
        System.out.println("run method ");
    }

    public static void main(String[] args) {
        Runnable obj=new A();
        Thread t1=new Thread(obj);
        t1.start();
    }
    }

