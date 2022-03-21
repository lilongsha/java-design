package cn.lsuper.visitor;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 13:39
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
