package aufgabe13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testEquals() {

        Person p1 = new Person(25, "Max", "Müller", 179, 70);
        Person p2 = new Person(32, "Helga", "Müller", 175, 55);
        Person p3 = new Person(25, "Max", "Müller", 179, 70);


        assertEquals(p1.equals(p3), true);
        assertEquals(p1.equals(p2), false);



        //boolean result = p1.equals(p3);
        //boolean result1 = p1.equals(p2);
        //assertEquals(result, true);
        //assertEquals(result1,false);

    }

    @Test
    void testNotEquals() {

    }
}


