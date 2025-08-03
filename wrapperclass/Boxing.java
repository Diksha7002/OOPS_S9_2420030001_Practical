package wrapperclass;

public class Boxing {
public static void main(String[] args) {
	int num=100;
	Integer Boxednum=Integer.valueOf(num);
	
	System.out.println("Primitive value: "+num);
	System.out.println("Boxed value: "+Boxednum);
}
}
