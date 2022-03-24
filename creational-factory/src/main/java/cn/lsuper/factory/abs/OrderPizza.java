package cn.lsuper.factory.abs;

import cn.lsuper.factory.simple.pizza.Pizza;
import cn.lsuper.factory.util.GetTypeUtil;

/**
 * @author ALGiii
 */
public class OrderPizza {
    private AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);

    }

    public AbsFactory getAbsFactory() {
        return absFactory;
    }

    public void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;

        do {
            orderType = GetTypeUtil.getType();
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else  {
                System.out.println("订购失败");
                return;
            }
        } while (true);
    }
}
