package com.metin.reflection.example;

public class TestForShapeCreaterWithReflection {

    public static void main(String[] args) throws Exception {

        I i = (I) ShapeCreaterWithReflection.getShape("I");
        i.reverse();
        System.out.println("**********");
        T t = (T) ShapeCreaterWithoutReflection.getShape("T");
        t.reverse();
        System.out.println("**********");
        J j = (J) ShapeCreaterWithoutReflection.getShape("J");
        j.reverse();
    }
}
