package com.brainacad.oop.testshapes;

/**
 * Created by Alex on 9/20/2016.
 */
public class Shape {

    protected String shapeColor;

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public double calcArea(){
        return 0.0;
    }

    @Override
    public String toString(){
        return "Shape, color is: " + shapeColor;
    }
}


class Circle extends Shape{

    private double radius;

    final double PI = 3.1415;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea(){
        return PI * radius * radius;
    }

    @Override
    public String toString(){
        return "This is Circle, color: " + shapeColor + ", radius = " + radius;
    }
}



class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea(){
        return width * height;
    }

    @Override
    public String toString(){
        return "This is rectangle, color: " + shapeColor + ", width = " + width + ", height = " + height;
    }
}


class Triangle extends Shape{

    private double a, b, c;

        public Triangle(String shapeColor, double a, double b, double c) {
            super(shapeColor);
            this.a = a;
            this.b = b;
            this.c = c;
        }

    @Override
    public double calcArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString(){
        return "This is Triangle, color: " + shapeColor + ", a = " + a + ", b = " + b + ", c = " + c;
    }
}