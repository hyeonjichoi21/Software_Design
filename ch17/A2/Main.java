package ch17.A2;
public class Main {
    public static void main(String[] args) {
    	// ���� ���
        NumberGenerator generator = new RandomNumberGenerator();
        
        // �����ڵ�
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new FrameObserver();
        
        
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        
        
        generator.execute();
    }
}
