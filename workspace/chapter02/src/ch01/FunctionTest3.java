package ch01;

public class FunctionTest3 {

	public static void main(String[] args) {

		int unm1;
		int num2;
		int sum;

		add(100, 50);
		
	}
	
	
	public static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	
	public static int intAdd(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
	}
	
	public static double doubleAdd(double d1, double d2) {
		double result = d1 + d2;
		return result;
	}
	
	public static void printArticle(String article) {
		System.out.println("[" + article + "]");		
	}
	
	
	

}
