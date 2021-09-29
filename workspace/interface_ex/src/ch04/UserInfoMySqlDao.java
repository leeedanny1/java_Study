package ch04;

public class UserInfoMySqlDao implements UserInfoDao{
	
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL: 저장하기 " + userInfo.getUserName());
		System.out.println("MYSQL: 저장하기 " + userInfo.getUserId());
		System.out.println("MYSQL: 저장하기 " + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL: 수정하기 " + userInfo.getUserName());
		System.out.println("MYSQL: 수정하기 " + userInfo.getUserId());
		System.out.println("MYSQL: 수정하기 " + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("MYSQL: 삭제하기 " + userInfo.getUserName());
		System.out.println("MYSQL: 삭제하기 " + userInfo.getUserId());
		System.out.println("MYSQL: 삭제하기 " + userInfo.getPassword());
	}

}
