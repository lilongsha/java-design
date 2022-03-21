package cn.lsuper.visitor;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 13:40
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;
    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
