import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Setss{
    public static void main(String args[]){
        System.out.println("Sets In Java");
        // Collection<String> names=new HashSet<String>();
        Collection<String> names=new TreeSet<String>();
        Collection<String> cars=new TreeSet<String>();
        names.add("Akram");
        names.add("Abdul");
        names.add("Zyn");
        names.add("HARI SIR");
        //carnames 
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Maruti");
        cars.add("BMW");
        cars.add("Maruti");
        Iterator<String> carnames = cars.iterator();
        Iterator<String> studname = names.iterator();
        System.out.println("The carnames in the set by using the iterator");
        while(carnames.hasNext())
            System.out.println(carnames.next());
        System.out.println("The student names in set are by using iterator:");
        while(studname.hasNext())
            System.out.println(studname.next());
       
    }
}
