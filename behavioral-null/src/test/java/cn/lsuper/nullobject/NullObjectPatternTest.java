package cn.lsuper.nullobject;

import org.junit.jupiter.api.Test;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 11:11
 */
public class NullObjectPatternTest {
    @Test
    public void test() {
        AbstractCustomer rob = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer = CustomerFactory.getCustomer("");
        System.out.println(rob.getName());
        System.out.println(customer.getName());
    }
}
