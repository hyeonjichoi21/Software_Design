package ch15.Sample.pagemaker;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
	// �ٸ� Ŭ�������� �� Ŭ������ �ν��Ͻ��� new�� �̿��� ������Ű�� �ʰ� �ϱ� ���� 
	// private���� ������.
	private Database() {
	}

	// Properties �ν��Ͻ��� ������ ��,
	// (dbname).txt ���Ϸκ��� ���� ���� �Ӽ� ���� �о� �鿩 �̸� �����ϴ� �޼ҵ�
	public static Properties getProperties(String dbname) {
		String filename = dbname + ".txt";
		// Properties Ŭ������,
		// key(������Ƽ �̸�)�� value(������Ƽ�� ��) ������ �Ǿ� �ִ� �Ӽ��� ������ �����ϴ� Ŭ����
		Properties prop = new Properties();
		try {
			//FileInputStream Ŭ����: obtains input bytes from a file in a file system.
			prop.load(new FileInputStream(filename));
		} catch (IOException e) {
			System.out.println("Warning: " + filename + " is not found.");
		}
		return prop;
	}
}
// (dbname).txt ������,
// �Ӽ����� �����ϰ� �ִ� ����
// ����: key=value

