package ch21.Sample;

// PrinterProxy�� �����ؼ�, Printer�� �̿��ϴ� Ŭ����
public class Main {
	public static void main(String[] args) {
		// ����, PrinterProxy ���� �Ѵ�.
		Printable p = new PrinterProxy("Alice");
		System.out.println("������ �̸���" + p.getPrinterName() + "�Դϴ�.");
		
		// '����'�� �̸��� Bob���� �����Ѵ�.
		p.setPrinterName("Bob");
		System.out.println("������ �̸���" + p.getPrinterName() + "�Դϴ�.");

		// ���������� ������ Printer��ü�� �������� �ʾҴ�.
		// ��, �븮���� PrinterProxy ��ü�� ���� �Ѵ�.

		p.print("Hello, world."); // �� ������ ����� ��, ��μ� ������ Printer ��ü�� ���������.
		                                       // �ʿ��� �� ��μ� �����ȴ�.

	}
}
