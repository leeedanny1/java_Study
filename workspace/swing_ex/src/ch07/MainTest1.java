package ch07;

import java.util.Arrays;
import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {
		
		int[] numbers = new int[6];
		Random random = new Random();
		
		// ������ȣ 
		// 0~44 �����ϱ� +1 ���ָ� �� => 1~45;
		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1;
			numbers[i] = selectedNumber;
			
			for(int j = 0; j<i; j++) {
				if(numbers[i] == numbers[j]) {
					i -= 1;
					break;
				}
			}
		}
		
		Arrays.sort(numbers);
		for(int i:numbers) {
			System.out.println("������ ��: " + i);
		}
		
		
	}

}
