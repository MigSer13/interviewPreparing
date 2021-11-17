package ru.home.lesson1.polymorphism;

public class Main {

    public static void main(String[] args) {
        double perCircle = СalculatePerimeter.getPerimeter(new Circle(25.0));
        double perSquare = СalculatePerimeter.getPerimeter(new Square(25.0));
        double perTriangle = СalculatePerimeter.getPerimeter(new Triangle(25.0, 43.0, 38.0));
        System.out.println("Perimeter:" +
                "circle = " + perCircle + "\n" +
                "square = " + perSquare + "\n" +
                "circle = " + perTriangle );
    }
}
