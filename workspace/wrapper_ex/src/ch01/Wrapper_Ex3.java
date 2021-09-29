package ch01;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		int a= 10;
		String b = a + " : ...";
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		int i = Integer.parseInt(str);
		System.out.println("문자열을 int값으로 변환 :" + i);				
		
		double d = Double.parseDouble(str2);
		System.out.println("문자열을 double값으로 변환: " + d);
		
		boolean bo = Boolean.parseBoolean(str3);
		System.out.println("문자열을 boolean값으로 반환: " + bo);
		
		
		

	}

}
