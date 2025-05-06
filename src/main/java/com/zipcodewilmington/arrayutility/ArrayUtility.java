package com.zipcodewilmington.arrayutility;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public T countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        ArrayList<T> jawner = new ArrayList<>(Arrays.asList(inputArray));
        ArrayList<T> merge = new ArrayList<>(Arrays.asList(arrayToMerge));
        jawner.addAll(merge);
        Integer result = Collections.frequency(jawner, valueToEvaluate);
        return (T) result;
    }

    public T[] removeValue(T valueToRemove) {
        ArrayList<T> jawner = new ArrayList<>(Arrays.asList(inputArray));
        jawner.removeIf(T -> T.equals(valueToRemove));
        return (T[]) jawner.toArray();
    }

    public int getNumberOfOccurrences(T valueToEvaluate) {
        ArrayList<T> jawner = new ArrayList<>(Arrays.asList(inputArray));
        Integer result = Collections.frequency(jawner, valueToEvaluate);
        return  result;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> jawner = new ArrayList<>(Arrays.asList(inputArray));
        ArrayList<T> merge = new ArrayList<>(Arrays.asList(arrayToMerge));
        jawner.addAll(merge);

        T mostJawn = null;
        int most = Integer.MIN_VALUE;
        for (T object : jawner) {
            if (getNumberOfOccurrences(object) > most) {
                mostJawn = object;
                most = getNumberOfOccurrences(object);
            }
        }
        return mostJawn;
    } // Thought process here - sorted the array, use Lamda? maybe? to
}     // to check for most commong object
