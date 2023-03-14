package aufgabe11;

import aufgabe9.Punkt;

public class Kreis implements GeometrischesObjekt {
    double radius;




    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Kreis(double radius ) {
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                '}';
    }
}
