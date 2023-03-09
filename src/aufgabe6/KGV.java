package aufgabe6;

import java.util.Scanner;

public class KGV {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Zahl 1 eingeben: ");
        int zahl1 = sc.nextInt();
        System.out.println("Bitte Zahl 2 eingeben: ");
        int zahl2 = sc.nextInt();
        System.out.println(computeGgT(zahl1, zahl2));

    }

    public static int computeGgT(int a, int b) {
        int kgV = 1;
        int greaterNum = (a > b) ? a : b;
        int num = (a > b) ? a : b;
        int smallerNum = (a > b) ? b : a;
        for (int i = greaterNum; i > 0; i--) {
            if (greaterNum % smallerNum == 0) {
                kgV = greaterNum;
                return kgV;
            } else {
                greaterNum += num;
            }
        }
        return kgV;
    }
}
