package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<SomeType> {
    SomeType[] array;

    public ArrayUtility(SomeType[] input){
        this.array = input;
    }

    public SomeType[] removeValue(SomeType valueToRemove) {
        ArrayList<SomeType> removeArray = new ArrayList<>();
        for(SomeType someType : array) {
            if(someType != valueToRemove) {
                removeArray.add(someType);
            }
        }

        return removeArray.toArray(Arrays.copyOf(array, removeArray.size()));
    }

    public Integer countDuplicatesInMerge(SomeType[] arrayToMerge, SomeType valueToEvaluate) {
        int count = 0;
        for(SomeType someType : arrayToMerge){
            if(someType == valueToEvaluate) {
                count++;
            }
        }
        for(SomeType someType : array) {
            if(someType == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public SomeType getMostCommonFromMerge(SomeType[] arrayToMerge) {
        int count = 0;
        SomeType mostCommmon = null;
        for (SomeType someType : arrayToMerge) {
            if(getNumberOfOccurrences(someType) > count) {
                count =getNumberOfOccurrences(someType);
                mostCommmon = someType;
            }
        }
        return mostCommmon;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return Collections.frequency(Arrays.asList(array), valueToEvaluate);
    }
}
