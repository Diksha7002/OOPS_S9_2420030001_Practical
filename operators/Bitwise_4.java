package operators;

public class Bitwise_4 {
public static void main(String[] args) {
	int a=10;
	int b=5;
	
	int AND=a&b;
	int OR=a|b;
	int XOR=a^b;
	int compl=~a;
	
	System.out.println("Bitwise AND "+AND);
	System.out.println("Bitwise OR "+OR);
	System.out.println("Bitwise XOR "+XOR);
	System.out.println("Bitwise Complement "+compl);
}
}
