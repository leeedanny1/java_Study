package ch05;

//05-05. continue
public class ContinueTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		예약어 continue
//		무시하고 진행하는 continue
		
		int num, count = 0;
		final int MAX = 1000, MULTIPLE = 7;
		
		for(num = 1; num<=MAX; num++) {
			//3의 배수인경우
			if(num%MULTIPLE ==0) {
				count++;	//count를 1올리고
				continue; 	//남은거 무시하고 for문으로 돌아가라
			}
			System.out.println("출력값: " + num);		
		}
		System.out.println(MULTIPLE + "의 배수의 갯수는 " + count + "개 입니다.");

	}

}
