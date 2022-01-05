package cn.lsuper.flyweight;

import java.util.HashMap;

/**
 * @author ALGiii
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> CIRCLE_MAP = new HashMap<>();

    public static Shape getCircle(String color) {
        Shape shape = CIRCLE_MAP.get(color);
        if (shape == null) {
            shape = new Circle(color);
            CIRCLE_MAP.put(color, shape);
            System.out.println("Creating circle of color : " + color);
        }
        return shape;
    }
}
