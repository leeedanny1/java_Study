package ch10;

import java.util.Iterator;

public class MainTest2 {

	public static void main(String[] args) {

		//질럿을 배열과 for문으로 생성, 출력해보기
		
		Zealot[] zealots = new Zealot[12];
		
		for (int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("질럿 " + (i+1));
		}
		
		for (int i = 0; i < zealots.length; i++) {
			zealots[i].showInfo();
		}
		

	}

}
