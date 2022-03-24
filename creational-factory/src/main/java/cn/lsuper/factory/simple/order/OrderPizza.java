package cn.lsuper.factory.simple.order;

import cn.lsuper.factory.simple.pizza.Pizza;
import cn.lsuper.factory.util.GetTypeUtil;

/**
 * @author ALGiii
 */
public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public SimpleFactory getSimpleFactory() {
        return simpleFactory;
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do {
            orderType = GetTypeUtil.getType();
            pizza = this.simpleFactory.createPizza(orderType);
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

    //    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = gettype();
//            // 此处违反了开闭原则
//            if ("greek".equals(orderType)) {
//                pizza = new GreekPizza();
//                pizza.setName(" 希腊披萨");
//            } else if ("cheese".equals(orderType)) {
//                pizza = new CheesePizza();
//                pizza.setName(" 奶酪披萨");
//            } else if ("pepper".equals(orderType)) {
//                pizza = new PepperPizza();
//                pizza.setName(" 胡椒披萨");
//            } else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }
}
