package ch04;

public class UserInfoMySqlDao implements UserInfoDao{
	
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL: �����ϱ� " + userInfo.getUserName());
		System.out.println("MYSQL: �����ϱ� " + userInfo.getUserId());
		System.out.println("MYSQL: �����ϱ� " + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL: �����ϱ� " + userInfo.getUserName());
		System.out.println("MYSQL: �����ϱ� " + userInfo.getUserId());
		System.out.println("MYSQL: �����ϱ� " + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL: �����ϱ� " + userInfo.getUserName());
		System.out.println("MYSQL: �����ϱ� " + userInfo.getUserId());
		System.out.println("MYSQL: �����ϱ� " + userInfo.getPassword());
	}

}
