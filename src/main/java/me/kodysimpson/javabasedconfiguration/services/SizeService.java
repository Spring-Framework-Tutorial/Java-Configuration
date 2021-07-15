package me.kodysimpson.javabasedconfiguration.services;

public class SizeService {

    public int getSize(String shape){
        switch (shape){
            case "rectangle":
                return 5;
            case "circle":
                return 25;
            default:
                return 5;
        }
    }

}
