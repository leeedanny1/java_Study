package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		//���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		
		
		// ������1
		ThreeDPrinter dPrinter1 = new ThreeDPrinter(); 
		// ��Ἴ��
		dPrinter1.setMaterial(powder);
		
		// ��Ḧ ������ Ȯ���ϱ�
		Powder tempPowder = dPrinter1.getMaterial();
		System.out.println(tempPowder.toString());
		
		
		
		////////////////////////////////////
		// ������2
		ThreeDPrinter2 dPrinter2 = new ThreeDPrinter2();
		dPrinter2.setMaterial(plastic);
		Plastic plastic2 = dPrinter2.getMaterial();
		System.out.println(plastic2.toString());
		
		
		
		
		
		///////////////
		// ������3
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powder);
		
		Powder tempPowder2 = (Powder)printer3.getMaterial();
		System.out.println(tempPowder2.toString());
	}

}
