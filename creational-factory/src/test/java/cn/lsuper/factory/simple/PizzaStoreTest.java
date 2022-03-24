package cn.lsuper.factory.simple;

import cn.lsuper.factory.simple.order.OrderPizza;
import cn.lsuper.factory.simple.order.OrderStaticPizza;
import cn.lsuper.factory.simple.order.SimpleFactory;
import org.junit.jupiter.api.Test;

public class PizzaStoreTest {
    @Test
    public void test() {
//        new OrderPizza();
    }
    @Test
    public void simpleFactoryTest() {
        new OrderPizza(new SimpleFactory());
        System.out.println("--退出程序--");
    }

    @Test
    public void staticFactoryTest() {
        new OrderStaticPizza();
        System.out.println("--退出程序--");
    }

}
