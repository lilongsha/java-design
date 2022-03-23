package cn.lsuper.singleton;

/**
 * DCL double-checked locking
 * 双检锁、双重校验锁
 * 懒加载
 * 程序安全
 * 多程序情况下保持高性能，volatile
 * 锁只有在第一次创建时才会加锁，实例化后将不再需要加锁
 * @author ALGiii
 */
public class DoubleCheckedLockingSingleton {
    private volatile static  DoubleCheckedLockingSingleton instance;
    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("DoubleCheckedLockingSingleton say Hello World!");
    }
}
