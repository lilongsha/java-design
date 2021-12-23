package cn.lsuper.abstract_factory;

import cn.lsuper.abstract_factory.color.ColorFactory;
import cn.lsuper.abstract_factory.shape.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
