package lk.gdse.aad;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(20,10));

        Context context1 = new Context(new OperationSubstract());
        System.out.println(context1.executeStrategy(20,10));
    }
}