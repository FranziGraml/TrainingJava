package aufgabe11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometrischesObjektTestRechteck {

    private Rechteck a1;



    @BeforeEach
    public void initRechteck(){
        a1 = new Rechteck(10,15);

    }


    @Test
    void rechteckUmfang() {
        double r1= GeometrischesObjekt.rechteckUmfang(a1);

        assertEquals(r1, 50);


    }

    @Test
    void rechteckFlaeche() {
        double r2 = GeometrischesObjekt.rechteckFlaeche(a1);

        assertEquals(r2,150);


    }
}