package ch06.Sample;

import ch06.Sample.framework.*;

public class Main {
    public static void main(String[] args) {

        // �غ�
        Manager manager = new Manager();
        
     
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

		UnderlinePen upen2 = new UnderlinePen('%');
		
    	/* 
		upen.use("csh");
		mbox.use("csh");
		sbox.use("csh");

		upen2.use("csh");
		*/


		// �Ŵ������� ���
        manager.register("strong message", upen); // key -value
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //  Prototype���κ��� ���� ����
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        
        Product p1_1 = manager.create("strong message");
        p1_1.use("Hello, world.");
        
        Product p1_2 = manager.create("strong message");
        p1_2.use("Hello, world.");
        
        
        
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
	
    }
}








