package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		order1.orderId = 1234;
		order1.buyerId = "구매자";
		order1.sellerId = "판매자";
		order1.productId = 456456;
		order1.orderDate = "2021-08-23";
				
				
		UserInfo userinfo1 = new UserInfo();
		
		userinfo1.userId = "사용자아이디";
		userinfo1.userPassWord = "********";
		userinfo1.userName = "사용자이름";
		userinfo1.userAddress = "사용자주소";
		userinfo1.phoneNumber = "010-1234-5678";
		
		
		
		System.out.println("주문번호: " + order1.orderId);
		System.out.println("고객아이디: " + order1.buyerId);
		System.out.println("판매자아이디: " + order1.sellerId);
		System.out.println("제품번호: " + order1.productId);
		System.out.println("주문날짜: " + order1.orderDate);
		
		System.out.println("---------------------------------");
		
		System.out.println("아이디: " + userinfo1.userId);
		System.out.println("비밀번호: " + userinfo1.userPassWord);
		System.out.println("이름: " + userinfo1.userName);
		System.out.println("주소: " + userinfo1.userAddress);
		System.out.println("전화번호: " + userinfo1.phoneNumber);
		
	}

}
