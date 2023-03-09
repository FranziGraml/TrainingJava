package aufgabe7;

import java.util.Scanner;

public class Ratespiel {

    public static void main(String[] args) {
        rateZahl(100);

    }

    public static void rateZahl(int wertebereich){
        int zufallsZahl = (int)( Math.random()*wertebereich); //Zufallszahl

        System.out.println(zufallsZahl); //Aus Kontrollzwecken
        Scanner scanner = new Scanner(System.in); //Scanner-Objekt

        System.out.println("Gib eine Zahl zwischen 0 und "+wertebereich+" ein!");
        int eingabe = scanner.nextInt();//Eingabe wird gespeichert

        while (zufallsZahl != eingabe){ //Rate solange bis der Wert "eingabe" gleich ist wie der zufallszahl
            if (zufallsZahl<eingabe){
                System.out.println("Das ist leider falsch! Die zu erratende Zahl ist kleiner");
            }
            else {
                System.out.println("Das ist leider falsch! Die zu erratende Zahl ist größer");
            }
            eingabe = scanner.nextInt();//neuer Rateversuch
        }//Schleifenende
        System.out.println("Gewonnen!");//Falls Eingabe richtig
    }

}