package cn.lsuper.abstract_factory.color;

/**
 * Blue color
 * 红色
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
