package lk.gdse.aad;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("HEXA : " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
