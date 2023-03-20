package aufgabe20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Anni", 28, 160);
        Person person2 = new Person("Rana", 30, 140);
        Person person3 = new Person("Klaus", 48, 170);

        List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));

        Boolean parsable = new CSVParser().isParsable(persons);

        System.out.println("Is it parsable? " + parsable);


        String csv = new CSVParser().parse(persons); // Liste "persons" (collection of objects) wird in eine CSV-Datei umgewandelt

        System.out.println(csv);

    }
}

