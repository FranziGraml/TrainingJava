package aufgabeGeo;

import aufgabe9.Punkt;

import java.awt.*;

public class Triangle implements IGeo {

    private Punkt topLeft;
    private Punkt topRight;
    private Punkt bottomLeft;
    private Punkt bottomRight;

    public Triangle(Punkt topLeft, Punkt topRight, Punkt bottomLeft, Punkt bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
    public Triangle(Punkt bottomLeft, Punkt topRight) {
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.topLeft = new Punkt(bottomLeft.getX(), topRight.getY());
        this.bottomRight = new Punkt(topRight.getX(), bottomLeft.getY());
    }

    public Triangle(Point point, Point point1, Point point2) {
    }

    public Punkt getTopLeft() {
        return topLeft;
    }

    public Punkt getTopRight() {
        return topRight;
    }

    public Punkt getBottomLeft() {
        return bottomLeft;
    }

    public Punkt getBottomRight() {
        return bottomRight;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (topRight.getX() - topLeft.getX()) + 2 * (topLeft.getY() - bottomLeft.getY());
    }

    @Override
    public double calculateArea() {
        return (topRight.getX() - topLeft.getX()) * (topLeft.getY() - bottomLeft.getY());
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }




}
