import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.List;

public class CollectionExp{
    public static void main(String args[]){
        System.out.println("Escape character in Java");
        System.out.println("\"Abdul Akram\" is a Good Programmer in JAVA");
        // Collection arr=new ArrayList();
        List<Integer> arr1=new ArrayList<Integer>();
        Collection<String> arr=new ArrayList<String>();
        arr.add("Abdulakram");
        arr.add("Zain");
        arr.add("uzair");
        System.out.println("Abdulzyn is a good boy");
        arr1.add(45);
        arr1.add(55);
        arr1.add(95);
        arr1.add(456);
        arr1.add(55);
        // System.out.println(arr);
        for(Object obj:arr){
            for(int a:arr1){
                System.out.println(obj+"  "+a);
            }
        }
        System.out.println(arr1.size());
        arr1.reversed();
        System.out.println(arr1);   
    };
    
}
