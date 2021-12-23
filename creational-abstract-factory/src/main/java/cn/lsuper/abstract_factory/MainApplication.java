package cn.lsuper.abstract_factory;

import cn.lsuper.abstract_factory.color.Color;
import cn.lsuper.abstract_factory.shape.Shape;

public class MainApplication {
    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        assert shape != null;
        Shape circle = shape.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shape.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shape.getShape("SQUARE");
        square.draw();
        System.out.println("----------");
        AbstractFactory color = FactoryProducer.getFactory("color");
        assert color != null;
        Color red = color.getColor("red");
        red.fill();
        Color green = color.getColor("green");
        green.fill();
        Color blue = color.getColor("blue");
        green.fill();
    }
}
