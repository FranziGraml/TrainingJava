package aufgabe5;

import java.util.Scanner;


public class TestingBmi {


    public static double calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        return bmi;

    }

    public static String classify(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("Input height in meters");
        double height = sc.nextDouble();
        double bmi = calculateBMI(weight,height);
        System.out.print("The Body Mass Index is " + bmi);
    }
}

