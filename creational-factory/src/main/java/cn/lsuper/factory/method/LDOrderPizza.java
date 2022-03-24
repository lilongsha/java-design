package cn.lsuper.factory.method;

import cn.lsuper.factory.simple.pizza.Pizza;

/**
 * @author ALGiii
 */
public class LDOrderPizza extends OrderMethodPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDCheesePizza();
        }
        return pizza;
    }
}
