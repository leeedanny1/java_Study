package ch04;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("ORACLE: �����ϱ� " + userInfo.getUserName());
		System.out.println("ORACLE: �����ϱ� " + userInfo.getUserId());
		System.out.println("ORACLE: �����ϱ� " + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("ORACLE: �����ϱ� " + userInfo.getUserName());
		System.out.println("ORACLE: �����ϱ� " + userInfo.getUserId());
		System.out.println("ORACLE: �����ϱ� " + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("ORACLE: �����ϱ� " + userInfo.getUserName());
		System.out.println("ORACLE: �����ϱ� " + userInfo.getUserId());
		System.out.println("ORACLE: �����ϱ� " + userInfo.getPassword());
	}

}
