package ch03;

public class UserInfo {
	
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	
	
	// 생성자 오버로딩!!
	// 알트 + 쉬프트 + s  ->  generate constructor
	
	// 문제1. 기본생성자 생성
	public UserInfo() {}
	
	// 문제2. userId값을 받는 생성자 생성
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// 문제3. userId, userPassWord 생성자 생성
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	
	// 문제4. userId, userPassWord, userName
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	// 문제5. userId, userPassWord, userName, userAddress
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	// 문제6. userId, userPassWord, userName, userAddress, phoneNumber
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	// 문제7. 아무 데이터 만들어서 생성자 만들기
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
