// class to class use extends keyword
// class to interface use implements keyword
// interface to interface use entends keyword
// Types of interfaces 1) Normal Interface 2) Single Abstract method 3) Markers interface
// 
// 
interface A{
    String name="Abdul_Akram"; //The variables are final and static
    void drive();
    void brake();
}
interface Ba{
    void game();
}
class B implements A,Ba{
    public void drive(){
        System.out.println("I am Driving a Car");
    }
    public void brake(){
        System.out.println("I am Braking the car");
    }
    public void game(){
        System.out.println("I am Playing the game");
    }

}

public class interfaces{
    public static void main(String args[]){        
        B obj=new B();
        System.out.println(B.name);
        obj.drive();
        // A.name="ZainAkram";
        obj.brake();
        obj.game();
        
    }
}
    
    
    
