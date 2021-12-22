package cn.lsuper.factory;

/**
 * Shape factory
 * 图形工厂
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    public Shape getShape1(String shapeType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Shape) Class.forName(shapeType).newInstance();
    }
}
