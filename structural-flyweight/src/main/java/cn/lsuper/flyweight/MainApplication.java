package cn.lsuper.flyweight;

/**
 * 享元模式、工厂模式、单例模式、原型模式有什么区别
 * @author ALGiii
 */
public class MainApplication {
    private static final String[] COLORS =
            { "Red", "Green", "Blue", "White", "Black" };
    private static final int NUM = 20;
    public static void main(String[] args) {

        for(int i=0; i < NUM ; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return COLORS[(int)(Math.random()*COLORS.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
