package cn.lsuper.factory.method;

import cn.lsuper.factory.simple.pizza.Pizza;

/**
 * @author ALGiii
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName(" 伦敦的胡椒披萨");
        System.out.println(" 伦敦的胡椒披萨 准备材料");
    }
}
