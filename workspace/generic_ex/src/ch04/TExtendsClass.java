package ch04;

public class TExtendsClass {
	
	@Override
	public String toString() {
		return "���� ���Դϴ�.";
	}
	
	

	public static void main(String[] args) {

		// <T extendsŬ����> ����ϱ�
		// T �ڷ����� ������ ������ �� �ִ�.(�������� ������, �ڷ������� �ƹ�Ŭ������ �� �� �ִ�.)
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder.toString());
		
		System.out.println("-------------------");
		
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		

	}

}
