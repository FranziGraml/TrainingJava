package aufgabeGeo;

import aufgabe9.Punkt;

import java.awt.*;
//import sun.security.ec.point.Point;

public class Circle implements IGeo  {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI  * (Math. pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
