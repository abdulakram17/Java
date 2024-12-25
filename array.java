public class array {
     public static void main(String args[]){
        System.out.println("Array In Java");
        int marks[]={4,7,8,9,0};
        for (int i=0;i<=4;i++){
            System.out.println(marks[i]);
        }
        int nums[][]=new int[5][5];
    System.out.println("Multi_Dimensional Array");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                nums[i][j] = (int)(Math.random( )*100);
                System.out.print(nums[i][j]+" ");
            } 
            System.out.println(" ");
        }
        int num[][]=new int[3][] ;//Jagged Array the colums are not specify;
        num[0]=new int[3];
        num[1]=new int[4];
        num[2]=new int[2];
        // num[3]=new int[3];

        for (int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);   
            }
            
        }
        for(int n[]:nums)
        {
          for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println("_");
        }
    }
}
