package aufgabe11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometrischesObjektTest {

    private static final double DELTA = 0.001;

    private Kreis k1;

    @BeforeEach
    public void initKreis(){
        k1 = new Kreis(5);
    }

    @Test
    void kreisUmfang() {
        double kreis = GeometrischesObjekt.kreisUmfang(k1);

        assertEquals(kreis,31.41592653589793,DELTA);
    }

    @Test
    void kreisFlaeche() {
        double kreis = GeometrischesObjekt.kreisFlaeche(k1);

        assertEquals(kreis,78.53981633974483,DELTA);

    }
}