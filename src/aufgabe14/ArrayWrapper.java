package aufgabe14;

import java.util.Arrays;

public class ArrayWrapper {

     private int[] arr;
     private int count = 0;

    public ArrayWrapper(int size) {
        this.arr = new int[size];
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    /**
     * Methode für ein neues Element. Falls das Array zu klein ist,soll es sich verdoppeln
     * @param element
     */

    public void add(int element) {
        if(arr.length == count) {
            arr = Arrays.copyOf(arr, count*2);
        }
        arr[count++] = element;

    }

    /**
     * Die Methode gibt mir den Wert vom Index zurück
     * @param num
     * @return
     */
    public int getElement(int num) {
        return arr[num];
    }
    /**
     * Methode zur Rückgabe der aktuellen Array größe
     * @param
     * @return
     */
    public int arraySize() {
        return arr.length;
    }

    /**
     * Methode um zu sehen wieviele elemente sich gerade im Array befinden
     * @return
     */
    public int getElementCount() {
        return count;
    }
}
