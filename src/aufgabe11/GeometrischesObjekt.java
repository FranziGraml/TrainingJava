package aufgabe11;

public interface GeometrischesObjekt {





    public static double kreisUmfang(Kreis c1) {
        double radius = c1.getRadius();

        return 2 * radius * Math.PI;
    }

    public static double kreisFlaeche(Kreis c1) {
        double radius = c1.getRadius();

        return Math.pow(radius,2) * Math.PI;
    }


    public static double dreieckUmfang(Dreieck d1){
        double umfang = d1.a + d1.b + d1.c;

        return umfang;
    }

    public static double dreieckFlaeche(Dreieck dreieck) {
        double resultS = 0.5 * (dreieck.getA() + dreieck.getB() + dreieck.getC());
        double findC = Math.max(dreieck.getA(), dreieck.getB());
        double realC = Math.max(findC, dreieck.getC());
        double hoeheC = ((2 / realC) * Math.sqrt(resultS * (resultS - dreieck.getA()) * (resultS - dreieck.getB() * (resultS - dreieck.getC()))));
        double resultFlaeche = 0.5 * realC * hoeheC;
        return resultFlaeche;
    }

    public static double rechteckUmfang(Rechteck rechteck) {
        double resultUmfang = (rechteck.getSideA() * 2) + (rechteck.sideB * 2);
        return resultUmfang;
    }

    public static double rechteckFlaeche(Rechteck rechteck) {
        double resultArea = rechteck.sideA * rechteck.sideB;
        return resultArea;
    }
}


