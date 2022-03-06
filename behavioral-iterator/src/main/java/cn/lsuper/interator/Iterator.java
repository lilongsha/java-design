package cn.lsuper.interator;

/**
 * @author ALGiii
 */
public interface Iterator {
    /**
     * 返回是否有下一个元素
     * @return true有下一个元素，false无下一个元素
     */
    boolean hasNext();

    /**
     * 返回下一个元素
     * @return 如果有下一个元素返回，否则返回null
     */
    Object next();
}
