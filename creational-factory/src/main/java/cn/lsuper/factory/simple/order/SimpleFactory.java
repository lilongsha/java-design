package cn.lsuper.factory.simple.order;

import cn.lsuper.factory.simple.pizza.CheesePizza;
import cn.lsuper.factory.simple.pizza.GreekPizza;
import cn.lsuper.factory.simple.pizza.PepperPizza;
import cn.lsuper.factory.simple.pizza.Pizza;

/**
 * 简单工厂类
 * @author ALGiii
 */
public class SimpleFactory {

    /**
     * 根据orderType 返回对应的Pizza对象
     * @param type 披萨类型
     * @return Pizza
     */
    public Pizza createPizza(String type) {
        System.out.println(" 使用简单工厂类");
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨");
        } else if ("pepper".equals(type)) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨");
        }

        return pizza;
    }

    public static Pizza createPizzaStatic(String type) {
        System.out.println(" 使用简单工厂类");
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨");
        } else if ("pepper".equals(type)) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨");
        }

        return pizza;
    }
}
