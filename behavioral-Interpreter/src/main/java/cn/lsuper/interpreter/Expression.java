package cn.lsuper.interpreter;

/**
 * @author ALGiii
 */
public interface Expression {
    /**
     * 解释器
     * @param context 表达式内容
     * @return 返回真假
     */
    boolean interpret(String context);
}
