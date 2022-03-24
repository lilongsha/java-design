package cn.lsuper.factory.abs;

import cn.lsuper.factory.method.BJCheesePizza;
import cn.lsuper.factory.method.BJPepperPizza;
import cn.lsuper.factory.simple.pizza.Pizza;

/**
 * @author ALGiii
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
