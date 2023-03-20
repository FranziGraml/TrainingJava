package aufgabe22;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal hund = new Animal("Hund", 5, 35, 4);
    Animal katze = new Animal("Katze", 11, 2, 4);
    Animal vogel = new Animal("Vogel", 2, 1, 2);
    Animal spinne = new Animal("Spinne", 9, 1, 8);

    private final List<Animal> animalList = new ArrayList<>(Arrays.asList(hund,katze,vogel,spinne));



    @Test
    void twoLegs() {
        assertEquals(List.of(vogel),Animal.TwoLegs(animalList));
    }

    @Test
    void ageOverTen() {
        assertEquals(List.of(katze),Animal.AgeOverTen(animalList));
    }

    @Test
    void weightOver30AgeUnder20() {
        assertEquals(List.of(),Animal.WeightOver30AgeUnder20(animalList));


    }

    @Test
    void streamTwoLegs() {
        assertEquals(List.of(vogel),Animal.streamTwoLegs(animalList));
    }

    @Test
    void streamAgeOverTen() {
        assertEquals(List.of(katze),Animal.streamAgeOverTen(animalList));
    }

    @Test
    void streamWeightOver30AgeUnder20() {
        assertEquals(List.of(hund),Animal.streamWeightOver30AgeUnder20(animalList));
    }

    @Test
    void streamFourLegsUnevenAge() {
        assertEquals(List.of(hund, katze), Animal.streamFourLegsUnevenAge(animalList));
    }
}