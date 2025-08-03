package array;

public class Smallest_and_Largest {
	public static void main(String[] args) {
	        int[] numbers={23, 5, 78, 1, 34, 100, 12, 0};
	        int min=numbers[0];
	        int max=numbers[0];

	        for (int num : numbers) {
	            if (num<min) {
	                min=num;
	            }
	            if (num>max) {
	                max=num;
	            }
	        }
	        System.out.println("Smallest element: "+min);
	        System.out.println("Largest element: "+max);
}
}
