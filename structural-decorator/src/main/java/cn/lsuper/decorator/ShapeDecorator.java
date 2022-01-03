package cn.lsuper.decorator;

/**
 * @author ALGiii
 */
public abstract class ShapeDecorator implements Shape{
    protected final Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
