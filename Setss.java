// import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
public class Setss {
    public static void main(String args[]){
        System.out.println("Sets In Java");
        // Set nums=new HashSet();
        List<Integer> nums=new ArrayList<Integer>(); 
        List<String> krs=new ArrayList<String>(); 
        krs.add("A");
        System.out.println(krs);
        for(int i=0;i<10;i++){
            nums.add(i);
        }
        System.out.println(nums.size());
        System.out.println(nums);
        // System.out.println("In sets duplicate are not allowed and sorted array"+nums);
        for(int num:nums){
            System.out.println("The multiplication of number:"+num*2);
        }

    }
}
