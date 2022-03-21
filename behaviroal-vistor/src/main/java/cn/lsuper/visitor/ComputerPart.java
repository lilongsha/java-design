package cn.lsuper.visitor;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 13:40
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
