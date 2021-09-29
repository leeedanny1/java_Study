package ch03;

public class UserInfo {
	
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	
	
	// ������ �����ε�!!
	// ��Ʈ + ����Ʈ + s  ->  generate constructor
	
	// ����1. �⺻������ ����
	public UserInfo() {}
	
	// ����2. userId���� �޴� ������ ����
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// ����3. userId, userPassWord ������ ����
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	
	// ����4. userId, userPassWord, userName
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	// ����5. userId, userPassWord, userName, userAddress
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	// ����6. userId, userPassWord, userName, userAddress, phoneNumber
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	// ����7. �ƹ� ������ ���� ������ �����
	int empCode;
	
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber, int empCode) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
		this.empCode = empCode;
	}
}