 import java.util.*;
 public class task2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int totalMarks=0;
        System.out.println("Enter total no of subject");
        int totalSubject=sc.nextInt();
        for(int i=1;i<=totalSubject;i++){
            System.out.println("enter the marks of subjects: " +i);
            totalMarks+=sc.nextInt();
        }
        int percentage=totalMarks/totalSubject;
        if(percentage>=90){
           System.out.println("Total marks obtained by student: "+totalMarks);
           System.out.println("Percentage of a student: "+percentage+"%");
           System.out.println("Grade A+");
        }
        else if(percentage>=80 && percentage<90){
            System.out.println("Total marks obtained by student: "+totalMarks);
            System.out.println("Percentage of a student: "+percentage+"%");
            System.out.println(" Grade A");
        }
        else if(percentage>=70 && percentage<80){ 
            System.out.println("Total marks obtained by student: "+totalMarks);
            System.out.println("Percentage of a student: "+percentage+"%");
            System.out.println(" Grade B");
        }
        else if(percentage>=60 && percentage<70){
            System.out.println("Total marks obtained by student: "+totalMarks);
            System.out.println("Percentage of a student: "+percentage+"%");
            System.out.println(" Grade C");
        } 
        else if(percentage>=50 && percentage<60){
            System.out.println("Total marks obtained by student: "+totalMarks);
            System.out.println("Percentage of a student: "+percentage+"%");
            System.out.println(" Grade D");
        }   
        else if(percentage>=40&& percentage<50){ 
            System.out.println("Total marks obtained by student: "+totalMarks);
            System.out.println("Percentage of a student: "+percentage+"%");
            System.out.println(" Grade E");
        }  
        else{
            System.out.println("Total marks obtained by student: "+totalMarks);
            System.out.println("Percentage of a student: "+percentage+"%");
            System.out.println(" Grade F");
        } 
        sc.close();      
    }
}
