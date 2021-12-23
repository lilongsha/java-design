package cn.lsuper.singleton;

public class MainApplication {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();

        LazySingleObject lazySingleObject = LazySingleObject.getInstance();
        lazySingleObject.showMessage();

        TreadLazySingleton treadLazySingleton = TreadLazySingleton.getInstance();
        treadLazySingleton.showMessage();

        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
        doubleCheckedLockingSingleton.showMessage();

        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        staticInnerClassSingleton.showMessage();

        EnumSingleton.INSTANCE.showMessage();

    }
}
