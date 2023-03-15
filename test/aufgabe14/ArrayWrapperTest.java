package aufgabe14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWrapperTest {

    @Test
    void add() {
        ArrayWrapper aw = new ArrayWrapper(3);
        aw.add(1);
        aw.add(2);
        aw.add(3);
        aw.add(4);
        assertEquals(4, aw.getElementCount());
    }

    @Test
    void getElement() {

        ArrayWrapper aw = new ArrayWrapper(3);
        aw.add(5);
        assertEquals(aw.getElement(0), 5);

    }

    @Test
    void getElementCount() {
        ArrayWrapper aw = new ArrayWrapper(3);
        aw.add(1);
        aw.add(2);
        aw.add(3);
        assertEquals(3,aw.getElementCount());
    }
}