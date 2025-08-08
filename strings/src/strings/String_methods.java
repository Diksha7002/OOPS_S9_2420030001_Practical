package strings;

public class String_methods {
public static void main(String[] args) {
	        String str1=" HELLO WORLD ";
	        String str2="hello world";
	        
	        System.out.println("Initial String: '"+str1+"'");
	        System.out.println("1.String length: "+str1.length());
	        System.out.println("2.String character at 1 index: "+str1.charAt(1));
	        System.out.println("3.Sub-String: "+str2.substring(0));
	        System.out.println("4.Sub-String: "+str1.substring(1,7));
	        System.out.println("5.Equals to str2: "+str2.equals(str2));
	        System.out.println("6.Equals Ignore: "+str1.equalsIgnoreCase(str2));
	        System.out.println("7.Compare to str2: "+str1.compareTo(str2));
	        System.out.println("8.Compare to Ignore: "+str1.compareToIgnoreCase(str2));
	        System.out.println("9.Contain 'world': "+str2.contains("world"));
	        System.out.println("10.Starts with: "+str1.startsWith(" HE"));
	        System.out.println("11.Ends with: "+str1.endsWith("LD "));
	        System.out.println("12.Index of 'hello': "+str2.indexOf("hello"));
	        System.out.println("13.Last index of 'WORLD': "+str1.lastIndexOf("WORLD"));
	        System.out.println("14.Trim(): '"+str1.trim()+"'");
	        System.out.println("15.Replace 'hello' with 'Hello': "+str2.replace("hello","Hello"));
	        System.out.println("16.Replace All with: "+str1.replaceAll("O", "o"));
	        System.out.println("17.Replace First with: "+str1.replaceFirst("O","o"));
	        System.out.println("18.Convert to Lower Case: "+str1.toLowerCase());
	        System.out.println("19.Convert to Upper Case: "+str1.toUpperCase());
	        System.out.println("20.Is it Empty?: "+str1.isEmpty());
	        System.out.println("21.Value of: "+String.valueOf(100));
	        
	        for(char c:str1.toCharArray())
System.out.println("22."+c+" ");
}
}
	       