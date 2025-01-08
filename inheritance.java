// Inheritance in Java::Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class (child class) to inherit the properties (fields) and methods of another class (parent class). This mechanism promotes code reuse, modularity, and extensibility.
// In Java, inheritance is implemented using the extends keyword.
class College{
    String name="Lords Engineering College";
    public void dept(){
        System.out.println("CSE");
        System.out.println("IT");
        System.out.println("ECE");
        System.out.println("EEE");
        System.out.println("CIV");
    }
}
class CSE extends College{
    public  void  students(){
        System.out.println("A sec 61 STUDENTS");
        System.out.println("B sec 65 STUDENTS");
        System.out.println("C sec 29 STUDENTS");
    }
}
class Pass extends CSE{
    public void pass(){
        System.out.println("A sec pass 56 students");
        System.out.println("B sec pass 23 students");
        System.out.println("C sec pass 65 students");
    }
}
public class inheritance{

    public static void main(String[] args){
        System.out.println("Inheritance in java");
        System.out.println("Multiple Level Inheritance");
        // College clg=new College();
        // CSE cse=new CSE();
        Pass obj=new Pass();
        obj.students();
        System.out.println(obj.name);
        C akr = new C();
       
        
        System.out.println("Types of Inheritance in Java:\n" + //
                        "\n" + //
                        "Single Inheritance: A class inherits from one parent class.\n" + //
                        "Multilevel Inheritance: A class inherits from a class that is already a subclass of another class.\n" + //
                        "Hierarchical Inheritance: Multiple classes inherit from a single parent class.\n" + //
                        "Note: Java does not support multiple inheritance (a class inheriting from multiple parent classes) to avoid ambiguity, but it can be achieved through interfaces");
                        akr.sleep();
                        akr.eat();
                        
                    }



                }
class A{
    public void show(){
        System.out.println("Showing");
    }
}
class B{
    public void eat(){
        System.out.println("I am Eating");
    }
}
class C extends B{
    public void sleep(){
        System.out.println("Sleeping");
    }
}
