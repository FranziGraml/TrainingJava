package aufgabe11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometrischesObjektTestDreieck {

    private static final double DELTA = 0.001;

    private Dreieck a;
    @BeforeEach
    public void initDreieck(){
       a = new Dreieck(10,15,10);
    }


    @Test
    void dreieckUmfang() {
        double d1 = GeometrischesObjekt.dreieckUmfang(a);

        assertEquals(d1,35,DELTA);

    }


}