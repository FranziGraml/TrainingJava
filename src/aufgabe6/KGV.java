package aufgabe6;

import java.util.Scanner;

public class KGV {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Zahl 1 eingeben: ");
        int zahl1 = sc.nextInt();
        System.out.println("Bitte Zahl 2 eingeben: ");
        int zahl2 = sc.nextInt();
        //int kgV;
        //int valueGGT = computeGGT(zahl1, zahl2);
        //if (valueGGT == 1) {
        //    kgV = zahl2 * zahl1;
        //} else {
        //    kgV = (zahl1 * zahl2)/valueGGT;
        //}
        System.out.println(computeggT(zahl1, zahl2));
        //System.out.println("kgV: " + kgV);


    }

    public static int computeGGT(int zahl1, int zahl2) {
        int ggT;
        int kgV;
        int a = zahl1;
        int b = zahl2;
        if (zahl1 > zahl2) {
            if (zahl1 % zahl2 == 0) {
                return zahl2;
            } else {
                for (int i = zahl1; i > 0; i--) {
                    ggT = zahl1 % zahl2;
                    if (ggT == 0) {
                        kgV = (a * b) / b;
                        return kgV;
                    } else {
                        zahl1 = zahl2;
                        zahl2 = ggT;
                    }
                }
            }
        }
        return 1;
    }
    public static int computeggT(int a, int b) {
        int ggT;
        int kgV = 1;
        int rest = 1;
        int greaterNum = (a > b) ? a : b;
        int smallerNum = (a > b) ? b : a;
        for (int i = greaterNum; i > 0; i--) {
            rest = greaterNum % smallerNum;
            System.out.println("rest: " + rest);
            if (rest == 0) {
                kgV = (a * b);
                return kgV;
            }
            if (rest == 1) {
                kgV = greaterNum * smallerNum;
                return kgV;
            }
            greaterNum = smallerNum;
            smallerNum = rest;
        }

    return kgV;
    }
}
