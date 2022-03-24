package cn.lsuper.factory.abs;

import org.junit.jupiter.api.Test;

public class PizzaStoreTest {
    @Test
    public void test() {
        System.out.println(" 使用的抽象工厂模式");
        new OrderPizza(new LDFactory());
    }
}
