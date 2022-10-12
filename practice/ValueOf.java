public class ValueOf {
    public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "-1234";
		String str3 = "ABCD";
		String str4 = "1000";
		
		int num1 = Integer.valueOf(str1);
		int num2 = Integer.valueOf(str2);
		int num3 = Integer.valueOf(str3, 32);
		int num4 = Integer.valueOf(str4, 16);
		
	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(num3);
	    System.out.println(num4);
	}
}
