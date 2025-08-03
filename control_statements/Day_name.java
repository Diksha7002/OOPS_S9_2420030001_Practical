package control_statements;
import java.util.*;
public class Day_name {
public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a number (1 to 7): ");
	        int dayNumber=sc.nextInt();

	        String dayName;

	        switch (dayNumber) {
	            case 1:
	                dayName="Monday";
	                break;
	            case 2:
	                dayName="Tues7day";
	                break;
	            case 3:
	                dayName="Wednesday";
	                break;
	            case 4:
	                dayName="Thrusday";
	                break;
	            case 5:
	                dayName="Friday";
	                break;
	            case 6:
	                dayName="Saturday";
	                break;
	            case 7:
	                dayName="Sunday";
	                break;
	            default:
	                dayName="Invalid input!";
	        }

	        System.out.println("Day: "+dayName);
}
}
