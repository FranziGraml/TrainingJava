package aufgabe15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class shallowCopie {

    /**
     * Creates a List of shallow copies of a Person object
     * @param person object which will be copied
     * @param createCopy defines how many shallow copies are made to fill the List with
     * @return a List of shallow copies of a Person object
     */

    public static List<Person> createCopy(Person person, Integer copy) {
        List <Person> list = new ArrayList<>();
        for( int i= 0; i < copy; i++){
            list.add(person);

            System.out.println(person);

        }
        return list;
    }


    public static <T> List<T> genericCreateCopy(T o, Integer copy) {
        List <T> list = new ArrayList<>();
        for( int i= 0; i < copy; i++){
            list.add(o);



        }
        return list;
    }




    /*      private String[] data;


          public shallowCopie(String[] values) {
               data = values;
          }

          public void showData() {
               System.out.println( Arrays.toString(data) ); */
          }








