package cn.lsuper.prototype;

/**
 * Circle shape
 * 圆图形
 * @author ALGiii
 */
public class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.printf("Inside %s::draw() method.%n", type);
    }
}
