package cn.lsuper.factory.method;

import cn.lsuper.factory.simple.pizza.Pizza;

/**
 * @author ALGiii
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪披萨");
        System.out.println(" 北京的奶酪披萨 准备材料");
    }
}
