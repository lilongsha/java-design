package cn.lsuper.strategy;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 11:55
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
