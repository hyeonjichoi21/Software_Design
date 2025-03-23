package ch21.Sample;


// �����Ρ��� ��Ÿ���� Ŭ����
public class Printer implements Printable {
	private String name;

	public Printer() {
		heavyJob("Printer�� �ν��Ͻ��� ������");
	}

	public Printer(String name) { // ������
		this.name = name;
		heavyJob("Printer�� �ν��Ͻ�(" + name + ")�� ������");
	}

	public void setPrinterName(String name) { // �̸��� ����
		this.name = name;
	}

	public String getPrinterName() { // �̸��� ���
		return name;
	}

	public void print2(String string) {
		System.out.println("���� - print2( ): " + string);
	}
	
	public void print3(String string) {
		System.out.println("���� - print3( ): " + string);
	}
	
	// ������ �̸��� ���ڿ��� ȭ�鿡 �����
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}

	// ���ſ� �۾��� ��Ÿ��
	// 5�ʰ� �ɸ��� ��������� ���� �ɸ��� ��
	private void heavyJob(String msg) { 
		System.out.print(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.print(".");
		}
		System.out.println("�Ϸ�");
	}
}
