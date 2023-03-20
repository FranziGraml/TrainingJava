package aufgabe18;

import java.util.Objects;

public class Person {

    //Attribute

   private String vorname;

    public Person(String vorname) {
       this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return vorname.equals(person.vorname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname);
    }

}


