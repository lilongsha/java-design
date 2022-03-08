package cn.lsper.observer;

/**
 * @author ALGiii
 */
public abstract class Observer {
    protected Subject subject;

    /**
     * 数据更新通知
     */
    public abstract void update();
}
