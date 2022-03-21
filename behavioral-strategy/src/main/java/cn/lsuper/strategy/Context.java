package cn.lsuper.strategy;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 11:57
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
