import java.io.IOException;

public class Threads{
    public static void main(String args[]) throws IOException{
        System.out.println("Multiple Threads in java");
        abdul abd=new abdul();
        suhana suh=new suhana();
        // System.out.println("Priority::"+abd.getPriority());
        // System.out.println("Priority::"+suh.getPriority());
        // abd.setPriority(9);
        // suh.setPriority(1);
        // abd.setPriority(Thread.MAX_PRIORITY);
        // suh.setPriority(Thread.MIN_PRIORITY);
        abd.start();
        try{
            Thread.sleep(2);
        }
        catch(Exception e){
            System.out.prinln(e);
        }
        suh.start();
    }
}
class abdul extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hii");
            try{
                Thread.sleep(5);
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
}
class suhana extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hello"+i);
            try{
                Thread.sleep(5);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}