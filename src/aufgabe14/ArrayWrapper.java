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

    public void add(int element) {
        if(arr.length == count) {
            arr = Arrays.copyOf(arr, count*2);
        }
        arr[count] = element;
        count++;
    }

    public int getElement(int num) {
        return arr[num];
    }

    public int arraySize() {
        return arr.length;
    }

    public int getElementCount() {
        return count;
    }
}
