package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<SomeArray> {
    SomeArray[] array;

    public  ArrayUtility(SomeArray[] input){
        this.array = input;
    }



    public Integer countDuplicatesInMerge(SomeArray[] arrayToMerge, SomeArray valueToEvaluate) {

        int count = 0;
        for(SomeArray someArray : arrayToMerge){
            if(someArray == valueToEvaluate){
                count++;
            }
        }
        for(SomeArray someArray : array){
            if(someArray == valueToEvaluate)
            count++;
        }
        return count;
    }

    public SomeArray getMostCommonFromMerge(SomeArray[] arrayToMerge) {
        int count = 0;
        SomeArray mostCommon = null;

        for(SomeArray someArray : arrayToMerge){
            if(getNumberOfOccurrences(someArray) > count){
                count = getNumberOfOccurrences(someArray);
                 mostCommon = someArray;
            }
        }
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(SomeArray valueToEvaluate) {
        int numOcc = 0;
        for(SomeArray someArray : array){
            if(valueToEvaluate.equals(someArray)){
                numOcc++;
            }
        }
        return numOcc;
    }

    public SomeArray[] removeValue(SomeArray valueToRemove) {
        ArrayList<SomeArray> removeList = new ArrayList<>();
        for(SomeArray someArray : array){
            if(someArray != valueToRemove){
                removeList.add(someArray);
            }
        }
        return removeList.toArray(Arrays.copyOf(array, removeList.size()));
    }
}
