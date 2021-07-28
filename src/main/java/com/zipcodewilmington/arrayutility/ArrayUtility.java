package com.zipcodewilmington.arrayutility;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<SomeType> {
    SomeType[] intArray;
    public ArrayUtility(SomeType[] intArray){
        this.intArray = intArray;
    }
    public Integer countDuplicatesInMerge(SomeType[] arrayToMerge, SomeType valueToEvaluate) {
     Integer originalCounter = 0;
     Integer mergeCounter = 0;
        for(SomeType type : intArray){
        if(type == valueToEvaluate)
            originalCounter++;
        }
        for(SomeType type : arrayToMerge){
            if(type == valueToEvaluate)
                mergeCounter++;
        }
        Integer result = originalCounter + mergeCounter;

        return result;
    }

    public SomeType getMostCommonFromMerge(SomeType[] arrayToMerge) {
        Stream<SomeType> stream = Stream.concat(Arrays.stream(intArray), Arrays.stream(arrayToMerge));
        SomeType[] work = (SomeType[]) stream.toArray();
        SomeType element = null;
        int counter = 0;
        for (int i = 0; i < work.length; i++) {
            SomeType currentType = work[i];
            int currentTypeCount = 0;
            for(int j = 0; j < work.length; j++){
                if (work[j] == currentType){
                    currentTypeCount++;
                }
                if(currentTypeCount > counter){
                    element = currentType;
                    counter = currentTypeCount;
                }
            }

        }
        return element;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int counter = 0;
        for (int j = 0; j < intArray.length; j++) {
            if(intArray[j] == valueToEvaluate){
                counter++;
            }

        }
        return counter;
    }

    public SomeType[] removeValue(SomeType valueToRemove) {
        return null;
    }
}
