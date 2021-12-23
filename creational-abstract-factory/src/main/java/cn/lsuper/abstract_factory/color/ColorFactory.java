package cn.lsuper.abstract_factory.color;

import cn.lsuper.abstract_factory.AbstractFactory;
import cn.lsuper.abstract_factory.shape.Circle;
import cn.lsuper.abstract_factory.shape.Rectangle;
import cn.lsuper.abstract_factory.shape.Shape;
import cn.lsuper.abstract_factory.shape.Square;

/**
 * Color factory
 * 颜色工厂
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        } else if(color.equalsIgnoreCase("Green")){
            return new Green();
        } else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
