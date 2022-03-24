package cn.lsuper.factory.abs;

import cn.lsuper.factory.method.LDCheesePizza;
import cn.lsuper.factory.method.LDPepperPizza;
import cn.lsuper.factory.simple.pizza.Pizza;

/**
 * @author ALGiii
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        
        if ("cheese".equals(type)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
