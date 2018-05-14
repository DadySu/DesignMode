package abstactFactoryMode.factory.impl;

import abstactFactoryMode.Color;
import abstactFactoryMode.Shape;
import abstactFactoryMode.factory.AbstractFactory;
import abstactFactoryMode.impl.Circle;
import abstactFactoryMode.impl.Rectangle;
import abstactFactoryMode.impl.Square;

/**
 * 基于给定的信息生成实体类的对象。
 * @author liub 2018/5/14
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
