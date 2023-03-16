package aufgabe15;

public class Person {

    private String name;
    private Integer alter;
    private Integer gewicht;

    public Person(String name, Integer alter, Integer gewicht) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    public Integer getGewicht() {
        return gewicht;
    }

    public void setGewicht(Integer gewicht) {
        this.gewicht = gewicht;
    }
}
