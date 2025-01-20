import java.lang.Runnable;
class Counter{
    int number;
    public synchronized void increment(){
        number++;
    }
}
public class Racecondition {
    public static void main(String args[]){
        System.out.println("RaceAround Condition in Java");
        Counter count=new Counter();
        Runnable suh=()->{
            for(int i=0;i<=100;i++){
                count.increment();
            }
        };
        Runnable abd=()->{
            for(int i=0;i<=1000;i++){
                count.increment();
            }
        };
            Thread t1=new Thread(suh);
            Thread t2=new Thread(abd);
            t1.start();
            t2.start();

        Runnable obj=()->{
            for(int i=0;i<=1000;i++){
                count.increment();
            }
        };
        // try{
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // try{
        //     t2.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
      
        System.out.println(count.number);
          
    }
}
