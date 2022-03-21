package cn.lsuper.strategy;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 11:56
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
