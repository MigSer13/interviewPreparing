package ru.home.lesson1.polymorphism;

public class Main {

    public static void main(String[] args) {
        double perCircle = –°alculatePerimeter.getPerimeter(new Circle(25.0));
        double perSquare = –°alculatePerimeter.getPerimeter(new Square(25.0));
        double perTriangle = –°alculatePerimeter.getPerimeter(new Triangle(25.0, 43.0, 38.0));
        System.out.println("Perimeter:" +
                "circle = " + perCircle + "\n" +
                "square = " + perSquare + "\n" +
                "circle = " + perTriangle );
    }
}
