package cn.lsuper.singleton;

/**
 * 懒汉式
 * 懒加载，当获取实例时，如果未实例化，则实例化
 * 此方法非线程安全
 */
public class LazySingleObject {
    private static LazySingleObject instance;

    /**
     * 构造函数为private，这样该类就不会被实例化
     */
    private LazySingleObject() {}

    public static LazySingleObject getInstance() {
        if (instance == null) {
            instance = new LazySingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("LazySingleObject say Hello World!");
    }
}
