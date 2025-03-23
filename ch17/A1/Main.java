package ch17.A1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementalNumberGenerator(10, 150, 10); 
        
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        
        generator.execute();
    }
}
