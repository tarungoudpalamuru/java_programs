package multithread;

public class InterThreadCommunication extends Thread {
   synchronized void printTable() {
       for(int i=1;i<10;i++){
           try {
               if(i==3)
                   wait();
               else
                   System.out.println(Thread.currentThread().getName()+" "+i*5);
           }
           catch (Exception e) {
               System.out.println(e);
           }
       }

   }
   synchronized void add() {
        try {
            for (int i = 1; i < 10; i++) {
                if (i == 5)
                    notify();
                else
                    System.out.println(Thread.currentThread().getName()+" "+i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        final InterThreadCommunication obj= new InterThreadCommunication();
        Thread t1=new Thread(){
            public void run(){
                obj.printTable();
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.add();
            }
        };
        t1.start();
        t2.start();


    }
}
