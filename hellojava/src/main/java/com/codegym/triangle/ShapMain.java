package com.codegym.triangle;

public class ShapMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(4.0, 5.0);
        shapes[1] = new Circle(4.0);
        shapes[2] = new Circle(10.0);
        shapes[3] = new Triangle(5, 5, 9);
        shapes[4] = new Rectangle(7.0, 5.0);

        for (Shape s : shapes) {
            System.out.println(s);
        }
        for (Shape s : shapes) {
            if (s instanceof Circle) {
                System.out.println(((Circle) s).getArea());
            }
            if (s instanceof Rectangle) {
                System.out.println(((Rectangle) s).getArea());
            }
            if (s instanceof Triangle) {
                System.out.println(((Triangle) s).getArea());
            }
        }
        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }


    }
}
