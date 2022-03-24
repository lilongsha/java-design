package cn.lsuper.factory.abs;

import cn.lsuper.factory.simple.pizza.Pizza;

/**
 * @author ALGiii
 */
public interface AbsFactory {
    /**
     * 获取披萨
     * @param type 披萨类型
     * @return Pizza
     */
    Pizza createPizza(String type);
}
