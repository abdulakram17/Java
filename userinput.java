import java.util.Scanner;
public class userinput{
    public static void main(String args[]){
        System.out.println("Operations on two integers using scanner class:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first integer::");
        int num1=sc.nextInt();
        System.out.print("Enter the Second integer::");
        int num2=sc.nextInt(); 
        int add=num1+num2;
        int sub=num1-num2;
        int multiply=num1*num2;
        System.out.println("Addition of two integers:"+add);
        System.out.println("Subtraction of two integers:"+sub);
        System.out.println("multiplication of two integers:"+multiply);
        System.out.print("Enter the any number::");
        
       
    }
}