package cn.lsuper.factory.simple.pizza;

/**
 * @author ALGiii
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料");
    }
}
