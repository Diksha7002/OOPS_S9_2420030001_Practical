package strings;

public class String_methods {
public static void main(String[] args) {
	        String str="  Hello Java World  ";
	        String str2="hello java world";

	        System.out.println("Original String: \""+str+"\"");

	        System.out.println("1. Length: "+str.length());

	        System.out.println("2. charAt(2): "+str.charAt(2));

	        System.out.println("3. substring(2): "+str.substring(2));

	        System.out.println("4. substring(2, 7): "+str.substring(2, 7));

	        System.out.println("5. equals(str2): "+str.equals(str2));

	        System.out.println("6. equalsIgnoreCase(str2): "+str.trim().equalsIgnoreCase(str2));

	        System.out.println("7. compareTo(str2): "+str.compareTo(str2));

	        System.out.println("8. compareToIgnoreCase(str2): "+str.compareToIgnoreCase(str2));

	        System.out.println("9. contains(\"Java\"): "+str.contains("Java"));

	        System.out.println("10. startsWith(\"  He\"): "+str.startsWith("  He"));

	        System.out.println("11. endsWith(\"ld  \"): "+str.endsWith("ld  "));

	        System.out.println("12. indexOf(\"Java\"): "+str.indexOf("Java"));

	        System.out.println("13. lastIndexOf(\"a\"): "+str.lastIndexOf("a"));

	        System.out.println("14. trim(): \""+str.trim() + "\"");

	        System.out.println("15. replace('a', '@'): "+str.replace('a', '@'));

	        System.out.println("16. replaceAll(\"\\\\s\", \"_\"): "+str.replaceAll("\\s", "_"));

	        System.out.println("17. replaceFirst(\"\\\\s\", \"-\"): "+str.replaceFirst("\\s", "-"));

	        System.out.println("18. toLowerCase(): "+str.toLowerCase());

	        System.out.println("19. toUpperCase(): "+str.toUpperCase());

	        System.out.print("20. toCharArray(): ");
	        char[] chars=str.toCharArray();
	        for (char c:chars) {
	            System.out.print(c+" ");
	        }
	        System.out.println();

	        String emptyStr="";
	        System.out.println("21. isEmpty(): "+emptyStr.isEmpty());

	        int num=123;
	        System.out.println("22. valueOf(123): "+String.valueOf(num));

}
}
