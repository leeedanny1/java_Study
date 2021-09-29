package ch04;


// 보통 최고 선임 개발자가 인터페이스를 설계해서 클라이언트쪽 설계를 맡김.
// 또는 동기, 동료한테 DB쪽 연결 코딩을 맡김

// 인터페이스(규약, 약속)를 만들어 놓지 않는다면, 한 쪽 개발자가 작업이 끝날때 까지 기다려야함
// 즉, 개발시간 증가 --> 개발비용 증가
public interface UserInfoDao {

	// 클라이언트개발자는 매개변수로 UserInfo 객체만 넘겨주면 됨.
	// DB개발자고 UserInfo객체만 넘겨받아서 코딩을 해 주면 됨.
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
	
}
