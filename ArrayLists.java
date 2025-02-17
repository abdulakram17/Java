import java.util.ArrayList;
import java.util.Collection;
public class ArrayLists {
    public static void main(String args[]){
        System.out.println("Collections in java");
        Collection<String> cars = new ArrayList<String>();
        ArrayList<String> names=new ArrayList<String>();
        names.add("Abdul");
        names.add("Akram");
        names.add("Zain");
        names.add("Mirza");
        names.add("MirzaAkram");
        cars.add("BMW");
        cars.add("Mercedez Benx");
        cars.add("Audi");
        cars.add("MAruti");
        System.out.println(cars);
        System.out.println(names);
        //Iterate one by one by using Enhanced for loop
        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("The accessing element in arraylist by index value :"+names.get(4));
    }
}
