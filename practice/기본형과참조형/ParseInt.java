package 기본형과참조형;
public class ParseInt {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "1234";
		String str2 = "-1234";
		String str3 = "ABCD";
		String str4 = "1000";
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3, 32);
		int num4 = Integer.parseInt(str4, 16);
		
	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(num3);
	    System.out.println(num4);
	}
}
