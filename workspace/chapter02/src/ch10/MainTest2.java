package ch10;

import java.util.Iterator;

public class MainTest2 {

	public static void main(String[] args) {

		//������ �迭�� for������ ����, ����غ���
		
		Zealot[] zealots = new Zealot[12];
		
		for (int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("���� " + (i+1));
		}
		
		for (int i = 0; i < zealots.length; i++) {
			zealots[i].showInfo();
		}
		

	}

}