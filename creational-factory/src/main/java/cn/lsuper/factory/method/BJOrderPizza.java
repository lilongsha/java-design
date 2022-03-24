package cn.lsuper.factory.method;

import cn.lsuper.factory.simple.pizza.Pizza;

public class BJOrderPizza extends OrderMethodPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
