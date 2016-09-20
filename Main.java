package com.brainacad.oop.testshapes;

/**
 * Created by Alex on 9/20/2016.
 */
public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape("RED");
        System.out.println(shape);
        System.out.println("Shape area is " + shape.calcArea() + "\n");

        Circle circle = new Circle("GREEN", 10);
        System.out.println(circle);
        System.out.println("Circle area is " + circle.calcArea() + "\n");

        Rectangle rectangle = new Rectangle("BLUE", 11, 22);
        System.out.println(rectangle);
        System.out.println("Rectangle area is " + rectangle.calcArea() + "\n");

        Triangle triangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println(triangle);
        System.out.println("Triangle area is " + triangle.calcArea() + "\n" + "\n");

        Shape[] arr = new Shape[9];
        for (int i = 0; i < arr.length; i++){
            if (i < 5) {
                arr[i] = new Rectangle("RED", 5 + i, 5 + i);
            }
            if ((i >= 5) && (i < 7)) {
                arr[i] = new Circle("BLACK", 5 + i);
            }
            if (i > 6) {
                arr[i] = new Triangle("GREEN", 5 + i, 5 + i, 5 + i);
            }
        }

        double totalArea = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            totalArea = totalArea + arr[i].calcArea();
        }
        System.out.println("Total area is " + totalArea + "\n");

        double sumRectArea = 0, sumCircleArea = 0, sumTriangleArea = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] instanceof Rectangle){
                sumRectArea = sumRectArea + arr[i].calcArea();
            }
            if (arr[i] instanceof Circle){
                sumCircleArea = sumCircleArea + arr[i].calcArea();
            }
            if (arr[i] instanceof Triangle){
                sumTriangleArea = sumTriangleArea + arr[i].calcArea();
            }
        }
        System.out.println("Rectangle total area is " + sumRectArea);
        System.out.println("Circle total area is " + sumCircleArea);
        System.out.println("Triangle total area is " + sumTriangleArea);
    }

}
