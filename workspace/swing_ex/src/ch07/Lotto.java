package ch07;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// 생성자, 생성하는 메소드 호출
	public Lotto() {
		createNumbers();
	}


	int[] numbers = new int[6];
	
	// 번호 생성하는 메소드
	private void createNumbers() {
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1;
			numbers[i] = selectedNumber;

			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i -= 1;
					break;
				}
			}
		}
		
		// 순서대로 정렬
		Arrays.sort(numbers);
	}

}
