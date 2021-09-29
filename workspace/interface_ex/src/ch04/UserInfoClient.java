package ch04;

import java.util.Scanner;

public class UserInfoClient {
	
	// DBTYPE����
	public static String DBTYPE = "MSSQL";
	// public static String DBTYPE = "MYSQL";
	// public static String DBTYPE = "ORACLE";
	
	
	//main
	public static void main(String[] args) {
				
		// ��������� UserInfo ������ ����
		UserInfo userInfo = new UserInfo();
		
		// Scanner�� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���: ");
		String userName = sc.next();
		System.out.print("ID�� �Է��ϼ���: ");
		String userId = sc.next();
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
		String userPassword = sc.next();
		// �Է¹����� UserInfoŬ������ ������ ����
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


		//1. ȸ������
		userInfoDao.insertUserInfo(userInfo);
		//2. ȸ����������
		userInfoDao.updateUserInfo(userInfo);
		//3. ȸ������(Ż��)
		userInfoDao.deleteUserInfo(userInfo);
		
		
		
		
	}
	

}
