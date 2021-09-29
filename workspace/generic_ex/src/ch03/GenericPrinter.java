package ch03;

// 제네릭 자료형
public class GenericPrinter<T> {

	// T라는 대체문자 사용, E - element, K - key, V - value (사실 아무 문자나 사용 가능, 암묵적인 룰임)
	// 자료형 매개변수 (Type parameter)
	// 이 클래스를 사용하는 시점에서 실제 사용할 자료형을 지정합니다.
	
	private T material;	// T자료형으로 선언한 변수 material

	// g,setter
	public T getMaterial() {	// T자료형을 반환하는 제네릭 메서드
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
	
}
