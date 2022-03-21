package cn.lsuper.visitor;

import org.junit.jupiter.api.Test;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 14:22
 */
public class VisitorPatternTest {
    @Test
    public void test() {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
