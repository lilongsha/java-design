package cn.lsuper.abstract_factory.color;

/**
 * Red color
 * 红色
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
