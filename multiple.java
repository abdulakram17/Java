interface A{
    public default void eat(){
        System.out.println("Eating");
    }
    public default void drink(){
        System.out.println("A");
    }
}
interface B{
    public default void sleep(){
        System.out.println("Sleep");
    }
}
class C implements A,B{

    public void bark(){
        System.out.println("C is barking in parking");
    }
    
    public void sleep(){
        System.out.println("Sleepinng");
    }
}
public class multiple{
    public static void main(String[] args) {
        System.out.println("Multiple LEvel inheritance in java is not possible but we can achieve by interface");
        C obj=new C() ;
        obj.bark();
        obj.eat();
        obj.sleep();
        
    }
}