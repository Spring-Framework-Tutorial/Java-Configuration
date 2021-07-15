package me.kodysimpson.javabasedconfiguration.services;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

//no need to annotate this with @Component or @Service, etc anymore.
public class CircleShapeServiceImpl implements ShapeService{
    @Override
    public Shape getShape(Color color) {
        return new Circle(50, 50, 50, color);
    }
}
