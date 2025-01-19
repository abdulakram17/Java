class Bank{
     String Bankname="Abduls Bank Pvt Ltd";
    private String accname="abdulakram";
    private long accnum=78987;

    public void setdet(String accname,long accnum){
        this.accname =accname;
        this.accnum =accnum;
    }
    public void getdet(){
        System.out.println("Account holder name::"+accname);
        System.out.println("Account number::"+accnum);
    }   
}

//Encapsulation: A encapsulation is a object oriented programming which is used to bind the data with methods.
//we cannot access the attribute directly but we can acess indirectly by using the atttributes by using methods.. 
public class encaps {
    public static void main(String[] args){
        Bank acc1=new Bank();
        Bank acc2=new Bank();
        System.out.println(acc1.Bankname);
        acc1.setdet("Abdul",7860);
        acc1.getdet();
        acc2.setdet("pathan",678900);
        acc2.getdet();
        System.out.println(acc2.Bankname);
       // System.out.println(acc1.accnum);
    }
}
