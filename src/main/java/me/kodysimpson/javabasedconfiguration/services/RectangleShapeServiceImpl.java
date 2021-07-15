package me.kodysimpson.javabasedconfiguration.services;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

//no need to annotate this with @Component or @Service, etc anymore.
public class RectangleShapeServiceImpl implements ShapeService{

    @Override
    public Shape getShape(Color color) {
        return new Rectangle(25, 25, color);
    }

}
