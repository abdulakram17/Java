public class SwitchCase {
    public static void main(String a[]) {
        System.out.println("If else conditional statements");
        int age = 18;
        if (age>=18)
            System.out.println("You are eligble to vote");
        else
            System.out.println("You cant vote");
        String name="AbdulAkram";
        //new switch statment without using break statement less code
        switch(name){
            case "AbdulAkram"->System.out.println("Username is Abdul Akram");
            case "Kareem"->System.out.println("Username is kareem");
            case "abd"-> System.out.println("Username is abd");
        }
        //ternary operator
        String result = age<=15?"You can vote akram":"You cant vote akram";
        System.out.println(result);
        int marks=35;
        //ternary operator in java shorthand for if else conditional statements
        String results=marks==35?"Pass":"Fail";
        System.out.println(results);

        //Switch statement in days and older version of switch
        int day=8;
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday holiday");
            break;
            default:
            System.out.println("Invalid day");
        }
        int months=8;
        switch(months){
            case 1-> System.out.println("Jan");
            case 2-> System.out.println("Feb");
            case 3-> System.out.println("March");
            case 4-> System.out.println("April");
            case 5-> System.out.println("June");
            case 6-> System.out.println("July");
            case 7-> System.out.println("August");
            case 8-> System.out.println("sept");
            case 9-> System.out.println("Aug");
            case 10-> System.out.println("oct");
            case 11-> System.out.println("nov");
            case 12-> System.out.println("dec");


        }
    }
}
