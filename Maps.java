import java.util.Map;
import java.util.HashMap;
public class Maps{
public static void main(String args[]){
    System.out.println("Maps In JAva");
    Map<String,Integer> marks=new HashMap<>();
    marks.put("Abdul",55);
    marks.put("Zain",95);
    marks.put("Janab",45);
    marks.put("Akraam",95);
    marks.put("Abdull",55);
    marks.put("Abdul",786);
    for(String keys:marks.keySet()){
        System.out.println(keys+":::"+marks.get(keys));
    }
    System.out.println("the students in the class ::"+marks.keySet());
    System.out.println(marks.values());
    marks.clear();
    System.out.println("After clear method thwe marks are clear ::"+marks.isEmpty());
    
}   
}