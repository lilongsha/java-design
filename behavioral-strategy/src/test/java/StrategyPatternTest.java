import cn.lsuper.strategy.Context;
import cn.lsuper.strategy.OperationAdd;
import cn.lsuper.strategy.OperationSubtract;
import org.junit.jupiter.api.Test;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 12:03
 */
public class StrategyPatternTest {
    @Test
    public void test() {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 100));

        Context context1 = new Context(new OperationSubtract());
        System.out.println(context1.executeStrategy(10, 100));
    }
}
