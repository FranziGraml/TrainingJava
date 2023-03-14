package aufgabe13;

public class Person {

    //Attribute
    int alter;
    String Vorname;
    String nachname;
    int groesse;
    int gewicht;


    //Konstruktor
    public Person(int alter, String vorname, String nachname, int groesse, int gewicht) {
        this.alter = alter;
        Vorname = vorname;
        this.nachname = nachname;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }


    //Getter Setter
    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }


    // toString
    @Override
    public String toString() {
        return "Person{" +
                "alter=" + alter +
                ", Vorname='" + Vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", groesse=" + groesse +
                ", gewicht=" + gewicht +
                '}';
    }

    /**
     * Die Methode überprüft die Gleichheit mittels "=="
     * falls this(p1) == o(p3); dann return true   ---- Objekte stimmen überein
     * falls o(p3) == null(leeres Obj)|| Obj.p1 == Obj.v1 ect. dann return false -----Objekte stimmen nicht überein, weil Null oder andere Klasse
     * @param o um vergleichen zu können muss es in einen Punkt umgewandelt werden
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
       // if(alter == person.alter && groesse == person.groesse && gewicht == person.gewicht && Vorname.equals(person.Vorname) && nachname.equals(person.nachname)) {
       //     return true;
       // };
        return (alter == person.alter && groesse == person.groesse && gewicht == person.gewicht && Vorname.equals(person.Vorname) && nachname.equals(person.nachname));
    }

    @Override
    public int hashCode() {
        return 0;
    }
}


