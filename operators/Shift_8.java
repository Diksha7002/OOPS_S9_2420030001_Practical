package operators;

public class Shift_8 {
public static void main(String[] args) {
	int num = 20;
	int leftshift1 = num<<1;
	int leftshift2 = num<<2;
	
	System.out.println("After left shift by 1: "+leftshift1);
	System.out.println("After left shift by 2: "+leftshift2);
	
	int rightshift1 = num>>1;
	int rightshift2 = num>>2;
	
	System.out.println("After right shift by 1: "+rightshift1);
	System.out.println("After right shift by 2: "+rightshift2);
}
}
