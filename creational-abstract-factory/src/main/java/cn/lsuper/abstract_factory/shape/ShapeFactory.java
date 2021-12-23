package cn.lsuper.abstract_factory.shape;

import cn.lsuper.abstract_factory.AbstractFactory;
import cn.lsuper.abstract_factory.color.Color;

/**
 * Shape factory
 * 图形工厂
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
