package ch02;

public class StringTest2 {

	public static void main(String[] args) {

		
		// 한 번 생성된 String은 불변이다.(immutable)
		
		//String을 연결하면 기존의 String에 연결되는것이 아닌 새로운 문자열이 생성된다.
		String java = new String("java");
		String android = new String("android");
		
		// String변수의 주소값을 확인해보고 싶다면,
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		System.out.println(android);
		
		System.out.println("-------------------------");
		
		//java = java + android;
		java = java.concat(android);
		System.out.println(java);
		// java 에 android를 추가했지만 새로운 String이 생성됨
		System.out.println(System.identityHashCode(java));
		

	}

}