package cn.lsuper.interpreter;

/**
 * @author ALGiii
 */
public class MainApplication {
    public static void main(String[] args) {
        TerminalExpression r = new TerminalExpression("R");
        TerminalExpression l = new TerminalExpression("L");

        AndExpression andExpression = new AndExpression(r, l);
        System.out.println(andExpression.interpret("LR"));
        System.out.println(andExpression.interpret("L"));
        System.out.println(andExpression.interpret("R"));

        OrExpression orExpression = new OrExpression(r, l);
        System.out.println(orExpression.interpret("LR"));
        System.out.println(orExpression.interpret("L"));
        System.out.println(orExpression.interpret("R"));

        System.out.println(r.interpret("LR"));
        System.out.println(r.interpret("L"));
        System.out.println(r.interpret("R"));
    }
}
