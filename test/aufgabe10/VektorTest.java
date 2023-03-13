package aufgabe10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VektorTest {

private Vektor v1;
private Vektor v2;

@BeforeEach
public void initVectors(){
    v1 = new Vektor(5,7,6);
    v2 = new Vektor(10,8,6);
}


    @Test
    void add(){
    Vektor addVektor = Vektor.add(v1,v2);




    }


    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}