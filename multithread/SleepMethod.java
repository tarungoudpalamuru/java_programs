package multithread;
public class SleepMethod extends Thread{
    public void run(){
            for (int i = 0; i < 5; i++) {
                try {
//                    Thread.sleep(1000);
                    Thread.currentThread().interrupt();
                    System.out.println(i + "  " + getName());
                }
                catch (Exception er) {
                    System.out.println(er);
                }
            }
        System.out.println("interrupted method ");
        }
    public static void main(String[] args) {
       SleepMethod s1=new SleepMethod();
       SleepMethod s2=new SleepMethod();
        System.out.println("thread s1 name "+s1.getName());
        System.out.println("thread s2 name "+s2.getName());
       s1.start();
       try{
           s1.interrupt();
           System.out.println(s1.isInterrupted());
       }
       catch(Exception e){
           System.out.println(e);
       }
        }
    }

