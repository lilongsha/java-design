package cn.lsuper.prototype;

/**
 * Rectangle shape
 * 矩形
 * @author ALGiii
 */
public class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.printf("Inside %s::draw() method.%n", type);
    }
}
