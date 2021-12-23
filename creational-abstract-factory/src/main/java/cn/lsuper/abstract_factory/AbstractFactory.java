package cn.lsuper.abstract_factory;

import cn.lsuper.abstract_factory.color.Color;
import cn.lsuper.abstract_factory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
