package ch01;

public class BookMainTest {

	public static void main(String[] args) {
		
		Book book1 = new Book("플러터UI실전", "김근호");
		Book book2 = new Book("플러터UI실전", "김근호");
		
		// toString 메소드를 이용해 원하는 return값 출력
		System.out.println(book1);
		// 주소값을 보고 싶을 때는 hashCode()
		System.out.println(book1.hashCode());
		
		String str = new String("test");
		System.out.println(str);
		System.out.println(str.toString());
		
		

		// --주소값만을 비교한다.--
		// 물리적 객체비교
		if(book1 == book2) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}
		
		System.out.println("-----------------------");
		
		// equals book1 book2 비교
		if(book1.equals(book2)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		

	}

}
