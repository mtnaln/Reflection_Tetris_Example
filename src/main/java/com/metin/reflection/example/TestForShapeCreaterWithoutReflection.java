package com.metin.reflection.example;

public class TestForShapeCreaterWithoutReflection {

    public static void main(String[] args) {

        I i = (I) ShapeCreaterWithoutReflection.getShape("I");
        i.reverse();
        System.out.println("**********");
        T t = (T) ShapeCreaterWithoutReflection.getShape("T");
        t.reverse();
        System.out.println("**********");
        J j = (J) ShapeCreaterWithoutReflection.getShape("J");
        j.reverse();
    }
}
