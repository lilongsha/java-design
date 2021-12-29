package cn.lsuper.bridge;

/**
 * 在些类的构造方法中传入桥
 * @author ALGiii
 */
public abstract class Shape{
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * 绘制图形
     */
    public abstract void draw();
}
