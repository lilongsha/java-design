package cn.lsuper.prototype;

/**
 * Square shape
 * 四边型
 * @author ALGiii
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.printf("Inside %s::draw() method.%n", type);
    }
}
