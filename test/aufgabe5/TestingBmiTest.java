package aufgabe5;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class TestingBmiTest {

    @Test

    public void calculateBmi(){

        double weight = 70;
        double height = 1.70;

        double BmiResult = TestingBmi.calculateBMI(weight, height);
        assertEquals( 24.22, BmiResult,0.01);

    }






}









