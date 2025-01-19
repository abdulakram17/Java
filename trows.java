public class trows{
    public static void main(String args[]){
        // String str="Abdul";
        System.out.println("Throws Keyword In Java");
        int i=5;
        int j=0;
        try{
            j=25/i;
            System.out.println(str.length());
            if(j==0)
                throw new ArithmeticException("d");
        }
        catch(ArithmeticException e){
            j=25/1;
            System.out.println("The Default Value is "+j);
        }
        catch(Exception e){
            System.out.println("Something went wrong so sad to hear this news"+e);
        }
        catch(ExceptionInInitializerError e){
            System.out.println(e);
        }
        
    }
}