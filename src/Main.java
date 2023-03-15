

import aufgabe11.Dreieck;
import aufgabe11.GeometrischesObjekt;
import aufgabe11.Kreis;
import aufgabe11.Rechteck;
import aufgabe13.Person;
import aufgabe14.ArrayWrapper;
import aufgabe9.Punkt;
import aufgabeGeo.Circle;
import aufgabeGeo.Rectangle;
import aufgabeGeo.Triangle;






public class Main {
    public static void main(String[] args) {


        //Aufgabe14
        ArrayWrapper person = new ArrayWrapper(3);
        System.out.println(person.getClass());

        person.add(1);
        //System.out.println(person.getElement(0));
        //System.out.println(person.getElement(1));
        person.add(3);
        person.add(4);
        person.add(5);
        //System.out.println(person.getElement(1));
        for (int i = 0; i < person.arraySize(); i++) {
            System.out.println(person.getElement(i));
        }

        //Aufgabe 9 Punkt!
       /* Punkt p1 = new Punkt(10.0,5);
        Punkt p2 = new Punkt(3,3);
        Punkt p3 = p1.addieren(p2);
        Punkt p4 = p1.subtrahieren(p2);
        System.out.println(p4);*/

        //Aufgabe 11
       /* Kreis c1 = new Kreis(5);
        Dreieck d1 = new Dreieck(10, 15, 10);
        Rechteck r1 = new Rechteck(10, 15);

        System.out.println(c1);
        System.out.println(GeometrischesObjekt.kreisFlaeche(c1));
        System.out.println(GeometrischesObjekt.kreisUmfang(c1));
        System.out.println(GeometrischesObjekt.dreieckUmfang(d1));
        System.out.println(GeometrischesObjekt.dreieckFlaeche(d1));
        System.out.println(GeometrischesObjekt.rechteckUmfang(r1));
        System.out.println(GeometrischesObjekt.rechteckFlaeche(r1));*/
    }



}







