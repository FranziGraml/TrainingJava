package aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingBmiEnumTest {

    @Test

    public void underWeight(){
        int weight = 20;
        int height = 184;
        double bmi = weight / ((height/100f) * (height/100f));


        assertEquals("UNTER", TestingBmiEnum.classifyBmi(bmi).toString());

    }

    @Test

    public void normalWeight(){
        int weight = 80;
        int height = 184;
        double bmi = weight / ((height/100f) * (height/100f));


        assertEquals("NORMAL", TestingBmiEnum.classifyBmi(bmi).toString());

    }

    @Test

    public void overWeight(){
        int weight = 100;
        int height = 184;
        double bmi = weight / ((height/100f) * (height/100f));

        assertEquals("UEBER", TestingBmiEnum.classifyBmi(bmi).toString());

    }

    @Test

    public void overOverWeight(){
        int weight = 130;
        int height = 184;
        double bmi = weight / ((height/100f) * (height/100f));

        assertEquals("SCHWER", TestingBmiEnum.classifyBmi(bmi).toString());

    }

}