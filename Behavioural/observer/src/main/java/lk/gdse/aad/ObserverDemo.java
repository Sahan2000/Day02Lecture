package lk.gdse.aad;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);

        System.out.println("State value : 10 ");
        subject.setState(10);
        System.out.println("State value : 20 ");
        subject.setState(20);
    }
}