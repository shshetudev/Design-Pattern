package Factory_Pattern;

import Factory_Pattern.ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(SHAPETYPE.CIRCLE);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(SHAPETYPE.RECTANGLE);
        shape2.draw();
        Shape shape3 = shapeFactory.getShape(SHAPETYPE.SQUARE);
        shape3.draw();
    }
}
