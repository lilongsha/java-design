package cn.lsuper.factory.method;

import org.junit.jupiter.api.Test;

public class PizzaStoreTest {
    @Test
    public void methodFactoryTest() {
        new BJOrderPizza();
        new LDOrderPizza();
    }
}
