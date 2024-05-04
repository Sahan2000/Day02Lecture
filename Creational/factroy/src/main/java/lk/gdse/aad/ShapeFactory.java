package lk.gdse.aad;

public class ShapeFactory {
    private static ShapeFactory shape;
    private ShapeFactory(){}
    public static ShapeFactory getInstance(){
        return (shape == null) ? shape = new ShapeFactory() : shape;
    }
    enum Type {
        CIRCLE,
        RECTANGLE,
        SQUARE
    }

    public static Shape getShape(Type type){
        switch (type){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
