package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		order1.orderId = 1234;
		order1.buyerId = "������";
		order1.sellerId = "�Ǹ���";
		order1.productId = 456456;
		order1.orderDate = "2021-08-23";
				
				
		UserInfo userinfo1 = new UserInfo();
		
		userinfo1.userId = "����ھ��̵�";
		userinfo1.userPassWord = "********";
		userinfo1.userName = "������̸�";
		userinfo1.userAddress = "������ּ�";
		userinfo1.phoneNumber = "010-1234-5678";
		
		
		
		System.out.println("�ֹ���ȣ: " + order1.orderId);
		System.out.println("�������̵�: " + order1.buyerId);
		System.out.println("�Ǹ��ھ��̵�: " + order1.sellerId);
		System.out.println("��ǰ��ȣ: " + order1.productId);
		System.out.println("�ֹ���¥: " + order1.orderDate);
		
		System.out.println("---------------------------------");
		
		System.out.println("���̵�: " + userinfo1.userId);
		System.out.println("��й�ȣ: " + userinfo1.userPassWord);
		System.out.println("�̸�: " + userinfo1.userName);
		System.out.println("�ּ�: " + userinfo1.userAddress);
		System.out.println("��ȭ��ȣ: " + userinfo1.phoneNumber);
		
	}

}