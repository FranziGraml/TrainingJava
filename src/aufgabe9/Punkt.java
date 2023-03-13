package aufgabe9;

public class Punkt {

    //Attribute

    double x;
     double y;


// Konstruktor

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;


    }

    // Methoden zum berechnen

    public Punkt addieren(Punkt p) {  //Methode, die die x,y-Koordinaten addiert und einen neuen Punkt zurück gibt
        double sumX = x + p.getX();  //die neuen x,y sind definiert als Sum der Koordinaten der Anfangspunkte (p1) und
        double sumY= y + p.getY();   //des p-Punktes (p2), der als Parameter in der Hauptmethode (p1.add(p2)) angegeben wird.
        return new Punkt(sumX,sumY); //neuer Punkt, der die Summe der beiden Punkte darstellt.
    }

    public  Punkt subtrahieren(Punkt p) {
        double subX = x - p.getX();
        double subY= y - p.getY();
        return new Punkt(subX,subY);
    }

    public  Punkt multiplizieren(double multipler) {
       double multX = x * multipler;
        double multY = y * multipler;
        return new Punkt(multX,multY);
    }

    public  Punkt dividieren(double divisor) {
        double diviX = x / divisor;
        double diviY = y / divisor;
        return new Punkt(diviX,diviY);
    }


    //Getter und Setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // ToString
    @Override
    public String toString() {
        return "( " + x + " , " + y +")";
    }
}




