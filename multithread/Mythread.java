package multithread;

public class Mythread implements Runnable{
    public synchronized void run() {
        System.out.println("run method using Thread class");
    }

    public static void main(String[] args)  {
//        Mythread t1=new Mythread();
//        Thread t2=new Thread(t1);
//        t2.start();
        Runnable r=new Mythread();
        Thread t3=new Thread(r,"runnable thread ");
        System.out.println(t3.getName());
        t3.start();
        t3.interrupt();
        System.out.println(10%20);

        String str1=new String("Hello");
        String str2=str1;
        str1=null;

        System.out.println(str2);
    }
}
