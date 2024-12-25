//Method overloading is the concept in the object oriented programming.;
//the same method with the same name but differenet in parameters;
//Definition: Method overloading occurs when multiple methods in the same class have the same name but differ in the type, number, or order of parameters.
//Purpose: It allows a class to have multiple methods performing similar functions but with different inputs.
class Calculator{
    public int add(int x,int y){
        return x+y;
    }
    public double add(double x,double y,double z){
        return x+y+z;
    }
}
public class Mthdovrldng {
    public static void main(String[] args) {
        System.out.println("Method overloading");
        Calculator obj=new Calculator();
        System.out.println(obj.add(2,3 ));
        double res=obj.add(5.5,7.8,78.9);
        System.out.println(res);
        System.out.println("Method Overriding");
        Faizan obj1=new Faizan();
        obj1.playmusic();
        obj1.eating();
        obj1.Driving();
    }
}
//Definition: Method overriding occurs when a subclass provides a specific implementation for a method already defined in its parent class.
//Purpose: It allows a subclass to modify or extend the behavior of a parent class method
class Akram{
    public void playmusic(){
        System.out.println("Akram is Playing Music");
    }
    public void Driving(){
        System.out.println("Akram is Driving bike");
    }
}
class Faizan extends Akram{
    public void eating(){
        System.out.println("Faizan Is eating");
    }
    public void Driving(){
        System.out.println("Faizan Is Driving Car");
    }
}