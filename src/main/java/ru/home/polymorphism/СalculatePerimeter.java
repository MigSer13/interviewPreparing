package ru.home.polymorphism;

public final class СalculatePerimeter<T extends Figure> {

    public static double getPerimeter(Figure figure){
        if(figure instanceof Circle){
            return 2 * Math.PI * ((Circle) figure).getRadius();
        }
        if(figure instanceof Square){
            return 4 * ((Square) figure).getSide();
        }
        if(figure instanceof Triangle){
            double a = ((Triangle) figure).getSide1();
            double b = ((Triangle) figure).getSide2();
            double c = ((Triangle) figure).getSide3();
            return a + b + c;
        }
        return 0;
    }
}
