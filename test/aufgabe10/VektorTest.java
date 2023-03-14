package aufgabe10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VektorTest {

private Vektor v1;
private Vektor v2;

@BeforeEach
public void initVectors(){
    v1 = new Vektor(10,10,10);
    v2 = new Vektor(2,2,2);
}


    @Test
    void add(){
    Vektor v3 = v1.add(v1, v2);
    assertEquals(v3.getA1(), 12);
    assertEquals(v3.getA2(), 12);
    assertEquals(v3.getA3(), 12);
    }

    @Test
    void subtract() {
    Vektor v3 = v1.subtract(v1,v2);
        assertEquals(v3.getA1(), 8);
        assertEquals(v3.getA2(), 8);
        assertEquals(v3.getA3(), 8);
    }

    @Test
    void crossProduct(){
    Vektor v3 = v1.crossProduct(v1,v2);
        assertEquals(v3.getA1(), 0.0);
        assertEquals(v3.getA2(), 0.0);
        assertEquals(v3.getA3(), 0.0);
    }

    @Test
    void multiply() {







    }

    @Test
    void divide() {
    }
}