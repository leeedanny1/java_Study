package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		//재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		
		
		// 프린터1
		ThreeDPrinter dPrinter1 = new ThreeDPrinter(); 
		// 재료세팅
		dPrinter1.setMaterial(powder);
		
		// 재료를 꺼내서 확인하기
		Powder tempPowder = dPrinter1.getMaterial();
		System.out.println(tempPowder.toString());
		
		
		
		////////////////////////////////////
		// 프린터2
		ThreeDPrinter2 dPrinter2 = new ThreeDPrinter2();
		dPrinter2.setMaterial(plastic);
		Plastic plastic2 = dPrinter2.getMaterial();
		System.out.println(plastic2.toString());
		
		
		
		
		
		///////////////
		// 프린터3
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powder);
		
		Powder tempPowder2 = (Powder)printer3.getMaterial();
		System.out.println(tempPowder2.toString());
	}

}
