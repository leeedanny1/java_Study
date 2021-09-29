package ch04;


// ���� �ְ� ���� �����ڰ� �������̽��� �����ؼ� Ŭ���̾�Ʈ�� ���踦 �ñ�.
// �Ǵ� ����, �������� DB�� ���� �ڵ��� �ñ�

// �������̽�(�Ծ�, ���)�� ����� ���� �ʴ´ٸ�, �� �� �����ڰ� �۾��� ������ ���� ��ٷ�����
// ��, ���߽ð� ���� --> ���ߺ�� ����
public interface UserInfoDao {

	// Ŭ���̾�Ʈ�����ڴ� �Ű������� UserInfo ��ü�� �Ѱ��ָ� ��.
	// DB�����ڰ� UserInfo��ü�� �Ѱܹ޾Ƽ� �ڵ��� �� �ָ� ��.
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
	
}
