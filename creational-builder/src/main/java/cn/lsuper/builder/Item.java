package cn.lsuper.builder;

/**
 * @author ALGiii
 */
public interface Item {
    /**
     * 获取当前餐品名称
     * @return 餐品名称
     */
    String name();

    /**
     * 返回当前餐品包装方式
     * @return 包装方式
     */
    Packing packing();

    /**
     * 返回当前餐品价格
     * @return 餐品价格
     */
    float price();
}
