package ch21.Sample;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����
		/*
		Printable p1 = new Printer("p1"); // 5�� ���� �ɸ�
		p1.print("�ֽ���");
		*/
		
		// �븮��
		Printable p2 = new PrinterProxy("p2"); 
		p2.print2("�ֽ���1"); // �븮���� ���� ��
		p2.print("�ֽ���2"); // ���� ���� => ������ ���� ��
		p2.print3("a");
		p2.print3("aaaaaa");
	}
	
	public static void method1(Printable p) {
		p.print("abc");
	}

}
