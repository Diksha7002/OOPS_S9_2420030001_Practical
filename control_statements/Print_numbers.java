package control_statements;
import java.util.*;
public class Print_numbers {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number N: ");
	        int n=sc.nextInt();
	            System.out.println("Numbers from 1 to " + n + ":");
	            for (int i = 1; i <= n; i++) {
	                System.out.print(i + " ");
	            }
}
}
