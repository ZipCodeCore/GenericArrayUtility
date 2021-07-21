package com.zipcodewilmington.arrayutility;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] input;
    public ArrayUtility(T[] inputArray){
        this.input = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        ArrayList<T> aList = new ArrayList<>(Arrays.asList(input));
        ArrayList<T> bList = new ArrayList<>(Arrays.asList(arrayToMerge));

        aList.addAll(bList);
        return Collections.frequency(aList, valueToEvaluate);
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> aList = new ArrayList<>(Arrays.asList(input));
        ArrayList<T> bList = new ArrayList<>(Arrays.asList(arrayToMerge));

        aList.addAll(bList);
        Integer amt = 0;
        T mostcommon = null;
        for(T element : aList){
            if (getNumberOfOccurrences(element) > amt) {
                amt = getNumberOfOccurrences(element);
                mostcommon = element;
            }
        }
        return mostcommon;

    }

    public T[] removeValue(T valueToRemove) {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(input));

        while (list.contains(valueToRemove)){
            list.remove(valueToRemove);
        }
        T[] arr = (T[])list.toArray(new Object[0]);
        return arr;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        ArrayList<T> aList = new ArrayList<>(Arrays.asList(input));
        return Collections.frequency(aList, valueToEvaluate);
    }
}
