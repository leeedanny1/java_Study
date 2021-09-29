package ch07;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// ������, �����ϴ� �޼ҵ� ȣ��
	public Lotto() {
		createNumbers();
	}


	int[] numbers = new int[6];
	
	// ��ȣ �����ϴ� �޼ҵ�
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
		
		// ������� ����
		Arrays.sort(numbers);
	}

}
