class A{
    public void show(){
        System.out.println("A is Showing");
    }
    public void eat(){
        System.out.println("A is Eating");
    }
    class B{
        public void Bath(){
            System.out.println("B is Bathing");
        }
        public void Listen(){
            System.out.println("B is Listening the music");
        }
    }
}
abstract class Car{
    public  void drive(){
        System.out.println("Akram Is Driving");
    }

    
    public void playMusic(){
        System.out.println("Akram Is driving a car");
    }
}
class Swift extends Car{
    public void drive(){
        System.out.println("Pathan is Driving");
    }
    public void sleep(){
        System.out.println(" Pathan is Sleeping");
    }
}
public class abstractscls{
    public static void main(String[] args){
        System.out.println("Abstract Class In Java");
        Swift obj=new Swift();
        // String name=obj.playMusic();
        A obj1=new A();
        obj.playMusic();
        obj.drive();
        System.out.println("            Inner Class In Java            ");
        obj1.eat();
        obj1.show();
        A.B obj2=obj1.new B();
        // A.B obj2=new A.B(); //When the class is static then this method follows 
        System.out.println("Class B Methods ; Class B is inner in Class A");
        obj2.Bath();
        obj2.Listen();
    }
}