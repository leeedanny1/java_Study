package ch04;

import java.util.Scanner;

public class UserInfoClient {
	
	// DBTYPE설정
	public static String DBTYPE = "MSSQL";
	// public static String DBTYPE = "MYSQL";
	// public static String DBTYPE = "ORACLE";
	
	
	//main
	public static void main(String[] args) {
				
		// 사용자한테 UserInfo 정보를 받음
		UserInfo userInfo = new UserInfo();
		
		// Scanner로 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String userName = sc.next();
		System.out.print("ID를 입력하세요: ");
		String userId = sc.next();
		System.out.print("비밀번호를 입력하세요: ");
		String userPassword = sc.next();
		// 입력받은값 UserInfo클래스의 변수에 저장
		userInfo.setUserName(userName);
		userInfo.setUserId(userId);
		userInfo.setPassword(userPassword);
		System.out.println("==========");
		
		
		UserInfoDao userInfoDao = null;
		if(DBTYPE.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else if(DBTYPE.equals("MSSQL")) {
			userInfoDao = new UserInfoMsSqlDao();
		} else {
			userInfoDao = new UserInfoOracleDao();
		}


		//1. 회원가입
		userInfoDao.insertUserInfo(userInfo);
		//2. 회원정보수정
		userInfoDao.updateUserInfo(userInfo);
		//3. 회원삭제(탈퇴)
		userInfoDao.deleteUserInfo(userInfo);
		
		
		
		
	}
	

}
