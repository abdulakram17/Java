public class HelloWorld{
    public static void main(String[] args){
        //variables= variable is store the temporary value
        String name="AbdulAkram";
        int marks = 67;
        double gpa = 5.6;
        char grade = 'a';
        boolean status = true;
        System.out.println("The marks of a student::"+marks );
        System.out.println("The gpa of a student::"+gpa);
        System.out.println("The result of a student::"+status);
        //Type casting
        float a =5.6f;
        int b=(int)a;
        byte c=123;
        int d = (int)c;
        System.out.println(b);
        System.out.println(d);
        //Arithmetic Operators
        int num1=7;
        int num2=5;
        int result=num1%num2;
        float gpa1=7.8f;
        float gpa2=8.8f;
        // to increment 1 num1++;
        num1+=2;//to increment by 2
        num1--;// to decrement by 1
        System.out.println("The addition of two nums::"+result);
        System.out.println("The multiplication of two nums::"+num1*num2);
        System.out.println("The multiplication of two nums::"+gpa1*gpa2);
        System.out.println("The remainder % of two nums::"+result);
        System.out.println("The division % of two nums::"+num1/num2);
        System.out.println("The increment of num::"+num1);
        int age=23;
        int afterage=age++;//age++ post increment-> first fetch the value and increment
        //++age pre increment ->first increment and add the value
        System.out.println(afterage);
        //Relational Operators or < > == != <= >= 
        int x = 9;
        int y = 10 ;
        int ab = 2;
        int ba= 4;
        System.out.println("both are true then value will be treu And Operator");
        System.out.println(x<y & ab<ba); 
        System.out.println(x>y & ab>ba); 
        System.out.println(x==y & ab==ba); 
        System.out.println(x!=y); 
        System.out.println("OR Operator one true is mandatory for true");
        //Logical Operators
        System.out.println(x<y | ab<ba); 
        System.out.println(x>y | ab>ba); 
        System.out.println(x==y | ab==ba); 
        System.out.println(x!=y);






    }
}
