package cn.lsuper.singleton;

/**
 * 饿汉式
 * 加载时，就构造对象
 * 线程安全
 * @author ALGiii
 */
public class SingleObject {
    private static final SingleObject INSTANCE = new SingleObject();

    /**
     * 构造函数为private，这样该类就不会被实例化
     */
    private SingleObject() {}

    public static SingleObject getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
