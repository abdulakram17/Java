import java.lang.Runnable;;
public class Runnables{
    public static void main(String args[]){
        System.out.println("Ruunnable in Java To achieve MultiThreading Concepts by using Lambda Expreessions");
        Runnable obj=()->{
            for(int i=0;i<=5;i++){
                System.out.println("Abdul Akram");
                try{
                    Thread.sleep(5);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        };
        Runnable abd=()->{
            for(int i=0;i<=5;i++){
                System.out.println("Abdul Zain");
            }
        };
        Thread t1=new Thread(obj);
        Thread t2=new Thread(abd);
        t1.start();
        t2.start();

        };
    }
