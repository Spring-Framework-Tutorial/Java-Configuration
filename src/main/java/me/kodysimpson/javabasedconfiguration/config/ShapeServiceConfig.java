package me.kodysimpson.javabasedconfiguration.config;

import me.kodysimpson.javabasedconfiguration.services.CircleShapeServiceImpl;
import me.kodysimpson.javabasedconfiguration.services.RectangleShapeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//A configuration class for your beans, to avoid having to scan for each and every
//bean class.
@Configuration
public class ShapeServiceConfig {

    @Bean //use this annotation to mark methods that will return instantiated beans
    @Profile("dev") //profiles can be used here
    public RectangleShapeServiceImpl rectangleShapeService(){
        //this time, you explicitly instantiate the objects rather than Spring
        return new RectangleShapeServiceImpl();
    }

    @Bean //use this annotation to mark methods that will return instantiated beans
    @Profile("prod")
    //@Primary this also works here
    public CircleShapeServiceImpl circleShapeService(){
        return new CircleShapeServiceImpl();
    }

}
