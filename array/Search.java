package array;
import java.util.*;
public class Search {
public static void main(String[] args){
	
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];
	        System.out.println("Enter "+size+" elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();
	        boolean found = false;
	        for (int i = 0;i<size;i++) {
	            if (arr[i] == key) {
	                System.out.println("Element found at index: " + i);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found in the array.");
	        }
}
}
