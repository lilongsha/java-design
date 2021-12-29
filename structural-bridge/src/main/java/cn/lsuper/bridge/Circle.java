package cn.lsuper.bridge;

/**
 * 此类中继承了Shape，也就有了DrawApi的桥，从而调用桥的实现类中的drawCorc;e()
 * @author ALGiii
 */
public class Circle extends Shape{
    private final int x;
    private final int y;
    private final int radius;
    protected Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }
}
