package cn.lsuper.abstract_factory.shape;

/**
 * Circle shape
 * 圆图形
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
