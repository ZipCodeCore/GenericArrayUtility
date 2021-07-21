package com.zipcodewilmington.arrayutility;

import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T [] currentArray;

    public ArrayUtility(T[] inputArr){
        this.currentArray = inputArr;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        ArrayList<T> mergedList = combine(arrayToMerge);
        this.currentArray = (T[]) mergedList.toArray();
        Integer count = getNumberOfOccurrences(valueToEvaluate);
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> mergedList = combine(arrayToMerge);
        T mostCommon = null;
        int mostCount = 0;
        for(T element : mergedList) {
            Integer currentCount = getNumberOfOccurrences(element);
            if(currentCount > mostCount){
                mostCount = currentCount;
                mostCommon = element;
            }
        }
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        ArrayList<T> currentList = new ArrayList<>(Arrays.asList(currentArray));
        Integer count = Collections.frequency(currentList,valueToEvaluate);
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        ArrayList<T> currentList = new ArrayList<>(Arrays.asList(currentArray));
        currentList.removeIf(e -> e.equals(valueToRemove));
        return (T[]) currentList.toArray();
    }

    private ArrayList<T> combine(T[] arrayToCombine) {
        ArrayList<T> arrToMergeAsList = new ArrayList<>(Arrays.asList(arrayToCombine));
        ArrayList<T> currentList = new ArrayList<>(Arrays.asList(currentArray));
        currentList.addAll(arrToMergeAsList);
        return currentList;
    }
}

