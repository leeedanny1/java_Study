package ch04;

public class TExtendsClass {
	
	@Override
	public String toString() {
		return "재료는 물입니다.";
	}
	
	

	public static void main(String[] args) {

		// <T extends클래스> 사용하기
		// T 자료형의 범위를 제한할 수 있다.(제한하지 않으면, 자료형으로 아무클래스나 올 수 있다.)
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder.toString());
		
		System.out.println("-------------------");
		
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		

	}

}
