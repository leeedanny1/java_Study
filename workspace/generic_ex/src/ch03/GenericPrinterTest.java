package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// ����� �� �ڷ����� �־��ָ� �ȴ�.
		// �����: T��� ����� �� � �ڷ����� ������� �������ָ� �ȴ�.
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>(); // �����Ͻ���
		
		// ���ֱ�
		genericPrinter.setMaterial(powder);
		
		// ��Შ����
		Powder tempPowder = genericPrinter.getMaterial();
		System.out.println(tempPowder.toString());
		
		
		
		// ����1. �ö�ƽ�� ����� �ְ� ��������!
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		genericPrinter2.setMaterial(plastic);
		
		Plastic plastic2 = genericPrinter2.getMaterial();
		System.out.println(plastic2);
		

	}

}
