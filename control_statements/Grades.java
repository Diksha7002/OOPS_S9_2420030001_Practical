package control_statements;
import java.util.*;
public class Grades {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter total marks (out of 100): ");
	        int marks = sc.nextInt();
	        
	        if (marks < 0 || marks > 100) {
	            System.out.println("Invalid marks.");
	        } else {
	            char grade;
	            if(marks>=90) {
	                grade='A';
	            }else if(marks>=80){
	                grade='B';
	            }else if(marks>=70){
	                grade='C';
	            }else if(marks>=60){
	                grade='D';
	            }else{
	                grade='F';
	            }
	            System.out.println("Marks: "+marks);
	            System.out.println("Grade: "+grade);
	     }
}
}
