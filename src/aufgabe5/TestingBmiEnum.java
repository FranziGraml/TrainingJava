package aufgabe5;

import java.util.Scanner;

import static aufgabe5.TestingBmiEnum.BmiClassify.*;

public class TestingBmiEnum {

    enum BmiClassify {
        UNTER,
        NORMAL,
        UEBER,

                SCHWER
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Größe in cm:");
        int height = Integer.parseInt(sc.nextLine());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Gewicht in Kg:");
        int weight = Integer.parseInt(sc.nextLine());

        System.out.println(classifyBmi(calculateBmi(height,weight)));
    }

    public static double calculateBmi(int height, int weight) {

        return weight / ((height / 100f) * (height / 100f));
    }


    public static BmiClassify classifyBmi(double bmi) {

        if (bmi < 18.5) {
            return UNTER;
        } else if (bmi <= 25) {
            return NORMAL;
        } else if (bmi <= 30) {
            return UEBER;
        } else {
            return SCHWER;
        }

    }


}
