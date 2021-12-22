package cn.lsuper.factory;

/**
 * Rectangle shape
 * 矩形
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
