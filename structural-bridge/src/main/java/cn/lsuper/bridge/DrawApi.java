package cn.lsuper.bridge;

/**
 * 些类相当于是桥
 * @author ALGiii
 */
public interface DrawApi {

    /**
     * 绘制圆
     * @param radius 圆半径
     * @param x 圆心x点
     * @param y 圆心y点
     */
    void drawCircle(int radius, int x, int y);
}
