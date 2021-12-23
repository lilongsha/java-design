package cn.lsuper.abstract_factory.shape;

/**
 * Square shape
 * 四边型
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
