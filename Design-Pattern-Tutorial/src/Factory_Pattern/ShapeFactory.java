package Factory_Pattern;

import java.awt.*;

public class ShapeFactory {
    public Shape getShape(SHAPETYPE shapeType){
        if (shapeType == null){
            return null;
        }
        if(shapeType.equals(SHAPETYPE.CIRCLE)){
            return new Circle();
        }
        if(shapeType.equals(SHAPETYPE.RECTANGLE)){
            return new Rectangle();
        }
        if(shapeType.equals(SHAPETYPE.SQUARE)){
            return new Square();
        }
        return null;
    }
}
