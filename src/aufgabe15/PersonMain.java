package aufgabe15;

import java.util.List;

public class PersonMain {

    public static void main(String[] args){

        Person p1 = new Person("Franzi",35,46);


        List list = shallowCopie.createCopy(p1,5);
        System.out.println(list.size());
        //System.out.println(p1);

        List<Person> listT = shallowCopie.genericCreateCopy(p1,5);
        System.out.println(list.size());



        /*String[] vals = {"Franzi", "Maxi","Oli"};
        shallowCopie elements = new shallowCopie(vals);
        elements.showData();
        vals[0] = "anna";
        elements.showData();*/
    }
}
