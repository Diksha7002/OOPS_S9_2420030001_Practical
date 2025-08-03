package wrapperclass;

public class Unboxing {
public static void main(String[] args) {
	Integer boxednum=Integer.valueOf(70);
	 int num=boxednum.intValue(); 
	
	System.out.println("Boxed value: "+boxednum);
	System.out.println("Unboxed value: "+num);
}
}
