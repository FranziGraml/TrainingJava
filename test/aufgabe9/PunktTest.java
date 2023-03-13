package aufgabe9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {

    private static final double DELTA = 0.001;


    private Punkt pointOne;
    private Punkt pointTwo;


    @BeforeEach
    public void initPunkt() {
        pointOne = new Punkt(10.0, 10.0);
        pointTwo = new Punkt(2.0, 2.0);

    }


    @Test
    void addieren() {
        Punkt pointThree = pointOne.addieren(pointTwo);

        assertEquals(pointThree.getX(), 12, DELTA);
        assertEquals(pointThree.getY(), 12, DELTA);

    }

    @Test
    void subtrahieren() {
        Punkt pointThree = pointOne.subtrahieren(pointTwo);

        assertEquals(pointThree.getX(), 8.0, DELTA);
        assertEquals(pointThree.getY(), 8.0, DELTA);
        ;
    }


    @Test
    void multiplizieren() {
        Punkt pointThree = pointOne.multiplizieren(2.0);

        assertEquals(pointThree.getX(), 20.0, DELTA);
        assertEquals(pointThree.getY(), 20.0, DELTA);
    }


    @Test
    void dividieren() {
        Punkt pointThree = pointOne.dividieren(2.0);

        assertEquals(pointThree.getX(), 5.0, DELTA);
        assertEquals(pointThree.getY(), 5.0, DELTA);
    }

}