package aufgabe22;

import java.util.ArrayList;
import java.util.List;



public class Animal {

    private String name;
    private Integer age;
    private Integer weight;
    private Integer numberOfLegs;

    public Animal() {
    }

    public Animal(String name, Integer age, Integer weight, Integer numberOfLegs) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
    }

    public static void add(Animal animal3) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static List<Animal>TwoLegs(List<Animal>animalList){
        List<Animal> filtredList = new ArrayList<>();
        for (Animal a : animalList) {
            if(a.getNumberOfLegs().equals(2) )filtredList.add(a);
        }
        return filtredList;
    }

    public static List<Animal> AgeOverTen(List<Animal> animalList){

        List <Animal> filterdlist = new ArrayList<>();

        for (Animal a : animalList) {
            if (a.getAge()>10) filterdlist.add(a);
        }

        return filterdlist;
    }

    public static List<Animal> AgeBetweenFiveEight(List<Animal> animalList){

        List <Animal> filterdlist = new ArrayList<>();

        for (Animal a : animalList) {
            if (a.getAge() <= 8 && a.getAge() >= 5) filterdlist.add(a);
        }

        return filterdlist;
    }

    public static List<Animal> WeightOver30AgeUnder20(List<Animal> animalList){

        List <Animal> filterdlist = new ArrayList<>();

        for (Animal a : animalList) {
            if (a.getWeight()>30 && a.getWeight()<20) filterdlist.add(a);
        }

        return filterdlist;
    }

    public static List<Animal> FourLegsUnevenAge(List<Animal> animalList){

        List <Animal> filterdlist = new ArrayList<>();

        for (Animal a : animalList) {
            if (a.getNumberOfLegs().equals(4) && (a.getAge() % 2 == 1)) filterdlist.add(a);
        }

        return filterdlist;
    }

    //Streams

    public static List<Animal>streamTwoLegs(List<Animal> animalList){
        List <Animal> filtredList = new ArrayList<>();
        filtredList = animalList.stream()
                .filter(animal -> animal.getNumberOfLegs().equals(2))
                .toList();

        return filtredList;

    }

    public static List<Animal> streamAgeOverTen(List<Animal> animalList){

        List <Animal> filterdlist = new ArrayList<>();

        filterdlist = animalList.stream()
                .filter(animal -> animal.getAge()>10)
                .toList();

        return filterdlist;

    }

    public static List<Animal> streamAgeBetweenFiveAndEight(List<Animal> animalList) {

         return  animalList.stream()
                .filter(animal -> animal.getAge() > 5)
                .filter(animal -> animal.getAge() < 8)
                .toList();

    }

    public static List<Animal> streamWeightOver30AgeUnder20(List<Animal> animalList){

        List <Animal> filtredList = new ArrayList<>();

        filtredList = animalList.stream()
                .filter(animal -> animal.getWeight() > 30)
                .filter(animal -> animal.getAge() < 20)
                .toList();

        return filtredList;
    }

    public static List<Animal> streamFourLegsUnevenAge(List<Animal> animalList){

        List <Animal> filtredList = new ArrayList<>();

        filtredList = animalList.stream()
                .filter(animal -> animal.getNumberOfLegs().equals(4))
                .filter(animal -> animal.getAge() % 2 == 1)
                .toList();

        return filtredList;
    }

}