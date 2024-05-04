package lk.gdse.aad;

public abstract class ShapeDecorator implements Shape{
    // can be inherite to sub class
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
