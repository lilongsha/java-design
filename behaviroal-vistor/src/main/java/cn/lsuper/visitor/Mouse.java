package cn.lsuper.visitor;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 13:40
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
