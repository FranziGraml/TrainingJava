package aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingTest {

    @Test

    public void shouldBeDivisible(){
        int two = 2;
        int zero = 0;


        assertTrue(UnitTesting.isDivisibleByTwo(two));
        assertTrue(UnitTesting.isDivisibleByTwo(zero));
    }


    @Test

    public void shouldNotBeDivisible(){
        int two = 13;
        int zero = 21;


        assertFalse(UnitTesting.isDivisibleByTwo(two));
        assertFalse(UnitTesting.isDivisibleByTwo(zero));
    }
}