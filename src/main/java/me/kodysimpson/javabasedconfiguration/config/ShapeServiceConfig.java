package me.kodysimpson.javabasedconfiguration.config;

import me.kodysimpson.javabasedconfiguration.services.CircleShapeServiceImpl;
import me.kodysimpson.javabasedconfiguration.services.RectangleShapeServiceImpl;
import me.kodysimpson.javabasedconfiguration.services.SizeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//A configuration class for your beans, to avoid having to scan for each and every
//bean class.
@Configuration
public class ShapeServiceConfig {

    //no need for this anymore since we use xml config for this bean
    //@Bean //a random bean we will inject into our shape services
    //public SizeService sizeService(){
    //    return new SizeService();
    //}

    @Bean
    @Profile("dev") //nothing needs to be changed here since the rectangleshapeservice is using prop injection
    public RectangleShapeServiceImpl rectangleShapeService(){
        return new RectangleShapeServiceImpl();
    }

    @Bean
    @Profile("prod") //Spring will pass the dependency bean into this method so you can instantiate properly
    public CircleShapeServiceImpl circleShapeService(SizeService sizeService){
        return new CircleShapeServiceImpl(sizeService);
    }

}
