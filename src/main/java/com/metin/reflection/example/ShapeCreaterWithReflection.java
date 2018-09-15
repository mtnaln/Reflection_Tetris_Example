package com.metin.reflection.example;

public class ShapeCreaterWithReflection {

    public static final String PACKAGE_PATH = "com.metin.reflection.example.";

    public static Shape getShape(String shapeName) throws Exception {

        Class cls = Class.forName(PACKAGE_PATH + shapeName);
        return (Shape) cls.newInstance();
    }
}
