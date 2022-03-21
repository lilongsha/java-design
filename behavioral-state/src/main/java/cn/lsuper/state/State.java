package cn.lsuper.state;

/**
 * @author ALGiii
 */
public interface State {
    /**
     * 执行方法
     * @param context 修改context中的状态
     */
    void doAction(Context context);
}
