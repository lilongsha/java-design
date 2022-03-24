package cn.lsuper.factory.simple.order;

import cn.lsuper.factory.simple.pizza.Pizza;
import cn.lsuper.factory.util.GetTypeUtil;

/**
 * @author ALGiii
 */
public class OrderStaticPizza {
    Pizza pizza = null;

    public OrderStaticPizza() {
        String orderType = "";

        do {
            orderType = GetTypeUtil.getType();
            pizza = StaticFactory.createPizza(orderType);
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
}
