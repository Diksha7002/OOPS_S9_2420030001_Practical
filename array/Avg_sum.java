package array;
import java.util.*;
public class Avg_sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] marks=new int[6];
	int total=0;
	
	System.out.println("Enter the marks of 6 subjects: ");
	
	for(int i=0;i<6;i++) {
		 System.out.print("Subject " +(i + 1)+ ": ");
         marks[i] = sc.nextInt();
         total += marks[i];
	}
	double avg = total/6;
	System.out.println("Total: "+total);
	System.out.println("Average: "+avg);
}
}
