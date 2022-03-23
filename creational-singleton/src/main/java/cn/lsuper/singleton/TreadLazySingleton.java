package cn.lsuper.singleton;

/**
 * 懒汉式
 * 懒加载，加锁，线程安全，性能太低每次都要加锁
 * @author ALGiii
 */
public class TreadLazySingleton {
    private static TreadLazySingleton instance;

    private TreadLazySingleton() {}

    public static synchronized TreadLazySingleton getInstance() {
        if (instance == null) {
            instance = new TreadLazySingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("TreadLazySingleton say Hello World!");
    }
}
