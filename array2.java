class Student{
    int marks;
    String name;
    int rollno;
}
public class array2{

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        std1.name="AbdulAkram";
        std1.rollno=7866;
        std1.marks=67;

        std2.name="PathanFaizan";
        std2.rollno=7867;
        std2.marks=72;

        std3.name="Ismail";
        std3.rollno=7868;
        std3.marks=78;
    Student students[]=new Student[3];
    students[0]=std1;
    students[1]=std2;
    students[2]=std3;

    // for(int i=0;i<students.length;i++){
    //     System.out.println(students[i].rollno+" "+students[i].name+" ::"+students[i].marks);
    // }   
    // Enhanced way for loop without needing indexing and incrementing 
   for(Student stud :students){
    System.out.println(stud.name+" : "+stud.marks);

   }

    }
}
