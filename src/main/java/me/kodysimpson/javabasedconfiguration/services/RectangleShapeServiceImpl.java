package me.kodysimpson.javabasedconfiguration.services;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import org.springframework.beans.factory.annotation.Autowired;

//no need to annotate this with @Component or @Service, etc anymore.
public class RectangleShapeServiceImpl implements ShapeService{

    @Autowired
    private SizeService sizeService;

    @Override
    public Shape getShape(Color color) {
        return new Rectangle(sizeService.getSize("rectangle"), sizeService.getSize("rectangle"), color);
    }

}
