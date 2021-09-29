package ch03;

// ���׸� �ڷ���
public class GenericPrinter<T> {

	// T��� ��ü���� ���, E - element, K - key, V - value (��� �ƹ� ���ڳ� ��� ����, �Ϲ����� ����)
	// �ڷ��� �Ű����� (Type parameter)
	// �� Ŭ������ ����ϴ� �������� ���� ����� �ڷ����� �����մϴ�.
	
	private T material;	// T�ڷ������� ������ ���� material

	// g,setter
	public T getMaterial() {	// T�ڷ����� ��ȯ�ϴ� ���׸� �޼���
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
