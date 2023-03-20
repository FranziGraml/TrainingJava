package aufgabe20;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVParserTest {

    private static final String SEPARATOR = ",";
    private static final String NEW_LINE = "\n";

    @CSVEntity
    private class Parseble {
    }

    private class NotParseble {
    }

    @CSVEntity
    private class HasFields {
        @CSVField
        public String name;
    }

    @Test
    public void isParsable() {
        assertTrue(new CSVParser().isParsable(new Parseble()));
    }
    @Test
    public void isNotParsable() {
        assertFalse(new CSVParser().isParsable(new NotParseble()));
    }

    @Test
    public void getFields() {
        Field expectedField = HasFields.class.getDeclaredFields()[0];
        Field actualField = new CSVParser().getFields(new HasFields()).get(0);
        assertEquals(expectedField, actualField);
    }

    @Test
    public void parse() {
        Person person1 = new Person("Anni", 28, 160);
        Person person2 = new Person("Rana", 30, 140);
        Person person3 = new Person("Klaus", 48, 170);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));
        String expectedCSV = """
                name , height
                Anni , 160
                Rana , 140
                Klaus , 170""" + NEW_LINE;
        String actualCSV = new CSVParser().parse(persons);

        assertEquals(expectedCSV, actualCSV);
    }
/*
    @Test
    public void generateCSVHeader() {
        String expectedCSVHeader = "name" + SEPARATOR + "age" + NEW_LINE;
        String actualCSVHeader = new CSVParser().generateCSVHeader(new Person());

        assertEquals(expectedCSVHeader, actualCSVHeader);
    }
    */


    @Test
    public void generateCSVContent() {
        Person person1 = new Person("Anni", 28, 160);
        Person person2 = new Person("Rana", 30, 140);
        Person person3 = new Person("Klaus", 48, 170);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));

        String expectedCSVContent = """
                Anni , 160
                Rana , 140
                Klaus , 170""" + NEW_LINE;
        String actualCSVContent = new CSVParser().generateCSVContent(persons);

        assertEquals(expectedCSVContent, actualCSVContent);
    }


}