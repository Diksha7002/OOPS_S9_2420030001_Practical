package control_statements;
import java.util.*;
public class Accept_num {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;

	        System.out.println("Enter numbers (enter 0 to stop):");

	        do {
	            num=sc.nextInt();
	            if(num!=0) {
	                System.out.println("You entered: "+num);
	            }
	        } while(num!=0);

	        System.out.println("Input stopped. You entered 0.");
}
}
