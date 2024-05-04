package lk.gdse.aad;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeFactory.Type.CIRCLE);
        circle.draw();
        Shape rectangle = ShapeFactory.getShape(ShapeFactory.Type.RECTANGLE);
        rectangle.draw();
        Shape square = ShapeFactory.getShape(ShapeFactory.Type.SQUARE);
        square.draw();
    }
}
