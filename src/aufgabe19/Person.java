package aufgabe19;

public class Person implements Comparable<Person> {

    Integer age;
    String firstName;
    String lastName;

    Integer height;
    Integer weight;

    /**
     * constructor method used to initialize objects. It is called when an object of a class is created.
     * @param age
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */
    public Person(Integer age, String firstName, String lastName, Integer height, Integer weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Person person) {
        return this.getAge().compareTo(person.getAge());
    }



    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

