package aufgabe7;

import java.util.Scanner;

public class Ratespiel {

    static void rateZahl(int wertebereich){
        int zufallsZahl = (int)( Math.random()*wertebereich); //Zufallszahl

        System.out.println(zufallsZahl); //Aus Kontrollzwecken
        Scanner scanner = new Scanner(System.in); //Scanner-Objekt

        System.out.println("Gib eine Zahl zwischen 0 und "+wertebereich+" ein!");
        int eingabe = scanner.nextInt();//Eingabe wird gespeichert

        while (zufallsZahl != eingabe){
            if (zufallsZahl<eingabe){
                System.out.println("Du liegst falsch! Die zu erratende Zahl ist kleiner");
            }
            else {
                System.out.println("Du liegst falsch! Die zu erratende Zahl ist größer");
            }
            eingabe = scanner.nextInt();//neuer Rateversuch
        }//Schleifenende
        System.out.println("Richtig!");//Falls Eingabe richtig
    }


    public static void main(String[] args) {
        rateZahl(100);
    }
}