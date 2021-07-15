package me.kodysimpson.javabasedconfiguration.services;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import org.springframework.beans.factory.annotation.Autowired;

//no need to annotate this with @Component or @Service, etc anymore.
public class CircleShapeServiceImpl implements ShapeService{

    private final SizeService sizeService;

    @Autowired //constructor injection
    public CircleShapeServiceImpl(SizeService sizeService){
        this.sizeService = sizeService;
    }

    @Override
    public Shape getShape(Color color) {
        return new Circle(sizeService.getSize("circle"), sizeService.getSize("circle"), sizeService.getSize("circle"), color);
    }
}
