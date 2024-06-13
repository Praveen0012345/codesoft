import java.util.Scanner;

public class Task2 {

    //student_grade-calculator
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student grade calculator");
        System.out.println("Enter no of subject");
        int nS=sc.nextInt();
        int total=0;
       
       
        for(int i=0;i<nS;i++){
            System.out.println("Enter marks obtain in "+i+":");
            int marks=sc.nextInt();
            total+=marks;
        }
        double averP=(double)total/nS;
        char Grade;


        if(averP>=90){
            Grade='O';
        }
        else if(averP>=80){
            Grade='A';
        }
        else if(averP>=70){
           Grade='B'; 
        }
        else if(averP>=60){
            Grade='C';
        }
        else if(averP>=50){
            Grade='D';
        }
        else if(averP>=33){
            Grade='E';
        }
        else {
            Grade='F';
        }
        
            System.out.println("Total Marks Scored"+total);

            System.out.println("Average Percentage is"+averP+"%");

            System.out.println("Grade :"+Grade);

            
    }
    
}
