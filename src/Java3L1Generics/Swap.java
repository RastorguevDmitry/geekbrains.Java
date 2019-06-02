package Java3L1Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap<T> {

    private T first;
    private T second;
    T[] massive;


    public Swap() {
        first = null;
        second = null;
    }

    public Swap(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }


    //передаем массив и индексы, которые нужно поменять
    public Swap(T[] massive, int first, int second) {
        this.massive = massive;
        Object temp = massive[first];
        massive[first] = massive[second];
        massive[second] = (T) temp;
    }

    public ArrayList<T> MassToArray(T[] massive) {
        this.massive = massive;
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(massive));
        return arrayList;
    }


}

class Demo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Swap<Integer> swap = new Swap<>(intArray, 1, 2);
        intArray = swap.massive;

        ArrayList<Integer> arrayList = swap.MassToArray(intArray);
        // System.out.println("Integer average is " + intArray);

        for (int i = 0; i < 5; i++) {
            System.out.println(intArray[i]);
        }
        for (Integer q:arrayList
             ) {
            System.out.println(q);
        }

    }
}
