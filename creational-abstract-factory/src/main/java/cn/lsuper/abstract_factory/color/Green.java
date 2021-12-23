package cn.lsuper.abstract_factory.color;

/**
 * Green color
 * 红色
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
