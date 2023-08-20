package multithread;

public class Mythread2 extends Thread{
    Mythread2(String s){
        super(s);
    }
    public  void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args)  {
        Mythread2 t1=new Mythread2("first thread");
        Mythread2 t2=new Mythread2("second thread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
//        t1.join();
//        t1.sleep(5000);
        t2.start();
    }
}
