package ch08;

import java.util.Arrays;
import java.util.Random;

// 로또번호 만드는 클래스
public class LottoNumber {

	// 로또 번호 갯수 메소드
	static final int LOTTO_NUMBER_SIZE = 6;
	
	// 로또 번호 만드는 메소드
	public int[] getLottoNumber() {
		// 번호를 담을 공간 만들기
		int[] numbers = new int[LOTTO_NUMBER_SIZE];
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1 ;
			numbers[i] = selectedNumber;
			
			// 중복되는 수 제거를 위한 이중 for문
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i -= 1;
					break;
				}
			}
		}
		// 배열 정렬
		Arrays.sort(numbers);
		return numbers;
	}

}
