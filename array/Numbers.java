package array;
import java.util.*;
public class Numbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input:");
	int size = sc.nextInt();
	int arr[]=new int [size];
	
	for(int i=0;i<size;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Output:");
	for(int i=0;i<size;i++)
		System.out.println(arr[i]);
}
}
