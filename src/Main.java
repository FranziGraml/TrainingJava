

import aufgabe9.Punkt;



public class Main {
    public static void main(String[] args) {

        Punkt p1 = new Punkt(10.0,5);
        Punkt p2 = new Punkt(3,3);
        Punkt p3 = p1.addieren(p2);
        Punkt p4 = p1.subtrahieren(p2);

        //Punkt newPunkt = PointUtilis.addPunkt(p1,p2);





        System.out.println(p4);
        //ystem.out.println(newPunkt);


    }







}