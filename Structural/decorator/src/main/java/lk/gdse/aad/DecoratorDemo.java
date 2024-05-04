package lk.gdse.aad;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("CIRCLE : normal border");
        circle.draw();
        System.out.println("\nCIRCLE : red border");
        redCircle.draw();
        System.out.println("RECTANGLE : red border");
        redRectangle.draw();
    }
}