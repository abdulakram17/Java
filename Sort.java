import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort{
    public static void main(String args[]){
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10>j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        System.out.println("Sort in JAVA");
        List<Integer> nums=new ArrayList<Integer>(Arrays.asList(43,31,72,29));
        System.out.println("Sort the array by using the Collections.sort");
        System.out.println("Before sorting the array:"+nums);
        Collections.sort(nums);
        System.out.println("After  sorting the array:"+nums);
        Collections.sort(nums,comp);
        System.out.println("After  sorting the array:"+nums);
        nums.forEach(n->System.out.println(n));
        List<Integer> even =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(even);
        System.out.println("The size of an array:"+even.size());
        System.out.println("map in below array to get even numbrs");
        even.forEach(n->System.out.println(n+":"+n*2));
        
}
}