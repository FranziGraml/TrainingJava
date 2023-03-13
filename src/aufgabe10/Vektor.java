package aufgabe10;

public class Vektor {
    double a1;
    double a2;
    double a3;

    public Vektor(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    public Vektor add(Vektor a, Vektor b) {
        double newA1 = a.getA1() + b.getA1();
        double newA2 = a.getA2() + b.getA2();
        double newA3 = a.getA3() + b.getA3();
        Vektor result = new Vektor(newA1, newA2, newA3);
        return result;
    }

    public Vektor subtract(Vektor a, Vektor b) {
        double newA1 = a.getA1() - b.getA1();
        double newA2 = a.getA2() - b.getA2();
        double newA3 = a.getA3() - b.getA3();
        Vektor result = new Vektor(newA1, newA2, newA3);
        return result;
    }

    public double skalarProduct(Vektor a, Vektor b) {
        double result = a.getA1() * b.getA1() + a.getA2() * b.getA2() + a.getA3() + b.getA3();
        return result;
    }

    public Vektor crossProduct(Vektor a, Vektor b) {
        double newA1 = a.getA2() * b.getA3() - a.getA3() * b.getA2();
        double newA2 = a.getA3() * b.getA1() - a.getA1() * b.getA3();
        double newA3 = a.getA1() * b.getA2() - a.getA2() * b.getA1();
        Vektor result = new Vektor(newA1, newA2, newA3);
        return result;
    }

    public Vektor multiply(Vektor a, double skalar) {
        double newA1 = a.getA1() * skalar;
        double newA2 = a.getA2() * skalar;
        double newA3 = a.getA3() * skalar;
        Vektor result = new Vektor(newA1, newA2, newA3);
        return result;
    }

    public Vektor divide(Vektor a, double skalar) {
        double newA1 = a.getA1() / skalar;
        double newA2 = a.getA2() / skalar;
        double newA3 = a.getA3() / skalar;
        Vektor result = new Vektor(newA1, newA2, newA3);
        return result;
    }

}
