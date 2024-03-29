package cn.lsuper.factory;

/**
 * @author ALGiii
 */
public class MainApplication {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        System.out.println("--------------------------");

        Shape circle = shapeFactory.getShape1("cn.lsuper.factory.Circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape1("cn.lsuper.factory.Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape1("cn.lsuper.factory.Square");
        square.draw();
    }
}
