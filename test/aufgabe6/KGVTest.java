package aufgabe6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KGVTest {

    @Test
    public void computeGgT() {
        int Zahl1 = 13;
        int Zahl2 = 7;

        int ggTResult = KGV.computeGgT(Zahl1, Zahl2);
        assertEquals(91, ggTResult);
    }

}