package com.example.design.creational.abstractFactory.shapeFactory.factory;

import com.example.design.creational.abstractFactory.shapeFactory.shape.Rectangle;
import com.example.design.creational.abstractFactory.shapeFactory.shape.Shape;
import com.example.design.creational.abstractFactory.shapeFactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
