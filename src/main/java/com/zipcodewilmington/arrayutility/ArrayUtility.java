package com.zipcodewilmington.arrayutility;

import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<SomeType> {

    private SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public List<SomeType> mergeArray(SomeType[] arrayToMerge){
        List<SomeType> mergedArray = new ArrayList<>();
        for (SomeType s : arrayToMerge) {
            mergedArray.add(s);
        }
        for (SomeType s : this.array) {
            mergedArray.add(s);
        }
        return mergedArray;
    }

    public Integer countDuplicatesInMerge(SomeType[] arrayToMerge, SomeType valueToEvaluate) {
        List<SomeType> mergedArray = mergeArray(arrayToMerge);
        int counter = 0;
        for (SomeType something: mergedArray) {
            if (something.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public SomeType getMostCommonFromMerge(SomeType[] arrayToMerge) {
        List<SomeType> mergedArray = mergeArray(arrayToMerge);
        Map<SomeType, Integer> myMap = new HashMap<>();
        for (SomeType s : mergedArray) {
            if (myMap.containsKey(s)) {
                myMap.put(s, myMap.get(s) + 1);
            } else {
                myMap.put(s, 1);
            }
        }
        int mostCommon = 0;
        SomeType theType = null;
        for (Map.Entry<SomeType, Integer> a: myMap.entrySet()){
            if (a.getValue() > mostCommon){
                mostCommon = a.getValue();
                theType = a.getKey();
            }
        }
        return theType;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int tracker = 0;
        for (int i = 0; i < array.length; i++) {
            if(valueToEvaluate.equals(array[i])) {
                tracker++;
            }
        }
        return tracker;
    }

    public SomeType[] removeValue(SomeType valueToRemove) {
        ArrayList<SomeType> arrayList = new ArrayList<>();
        for (SomeType element : array) {
            if (!element.equals(valueToRemove)) {
                arrayList.add(element);
            }
        }
        SomeType[] newArray = (SomeType[]) java.lang.reflect.Array.newInstance(array[0].getClass(),array.length);
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i] = arrayList.get(i);
        }
        return newArray;
    }
}
