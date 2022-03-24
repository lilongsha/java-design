package cn.lsuper.factory.method;

import cn.lsuper.factory.simple.pizza.Pizza;
import cn.lsuper.factory.util.GetTypeUtil;

/**
 * @author ALGiii
 */
public abstract class OrderMethodPizza {
    public OrderMethodPizza() {
        Pizza pizza = null;
        String orderType = "";

        do {
            orderType = GetTypeUtil.getType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败");
                return;
            }
        } while (true);
    }

    /**
     * 返回披萨
     * @param orderType 披萨类型
     * @return Pizza
     */
    public abstract Pizza createPizza(String orderType);
}
