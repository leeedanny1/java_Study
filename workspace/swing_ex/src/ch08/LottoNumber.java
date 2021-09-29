package ch08;

import java.util.Arrays;
import java.util.Random;

// �ζǹ�ȣ ����� Ŭ����
public class LottoNumber {

	// �ζ� ��ȣ ���� �޼ҵ�
	static final int LOTTO_NUMBER_SIZE = 6;
	
	// �ζ� ��ȣ ����� �޼ҵ�
	public int[] getLottoNumber() {
		// ��ȣ�� ���� ���� �����
		int[] numbers = new int[LOTTO_NUMBER_SIZE];
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1 ;
			numbers[i] = selectedNumber;
			
			// �ߺ��Ǵ� �� ���Ÿ� ���� ���� for��
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i -= 1;
					break;
				}
			}
		}
		// �迭 ����
		Arrays.sort(numbers);
		return numbers;
	}

}
