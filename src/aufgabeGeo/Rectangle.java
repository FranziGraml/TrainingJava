package aufgabeGeo;



import java.awt.*;

public class Rectangle implements IGeo {

    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle(Point bottomLeft, Point topRight) {
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.topLeft = new Point((int) bottomLeft.getX(), (int) topRight.getY());
        this.bottomRight = new Point((int) topRight.getX(), (int) bottomLeft.getY());
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getBottomRight() {
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