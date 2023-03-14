package aufgabe11;

public class Rechteck implements GeometrischesObjekt {
    double sideA;
    double sideB;

    public Rechteck(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
