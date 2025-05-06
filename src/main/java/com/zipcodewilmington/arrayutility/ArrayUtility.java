package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        ArrayList<T> input = new ArrayList<>(Arrays.asList(inputArray));
        ArrayList<T> merge = new ArrayList<>(Arrays.asList(arrayToMerge));

        input.addAll(merge);
        return Collections.frequency(input, valueToEvaluate);
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> input = new ArrayList<>(Arrays.asList(inputArray));
        ArrayList<T> merge = new ArrayList<>(Arrays.asList(arrayToMerge));
        T mostCommon = null;

        input.addAll(merge);
        Integer highestCount = 0;

        for(T element : input) {
            Integer tempCount = Collections.frequency(input, element);
            if(tempCount > highestCount) {
                highestCount = tempCount;
                mostCommon = element;
            }
        }
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        ArrayList<T> input = new ArrayList<>(Arrays.asList(inputArray));
        return Collections.frequency(input, valueToEvaluate);
    }

    public Object[] removeValue(T valueToRemove) {
        ArrayList<T> input = new ArrayList<>(Arrays.asList(inputArray));
        ArrayList<T> newList = new ArrayList<>();

        for(T element : input) {
            if(!element.equals(valueToRemove)) {
                newList.add(element);
            }
        }
        return newList.toArray(new Object[0]);
    }
}
