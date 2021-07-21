package com.zipcodewilmington.arrayutility;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E> {
    E[] inputArray;

    public ArrayUtility(E[] inputArray){
        this.inputArray=inputArray;
    }

    public Integer getNumberOfOccurrences(E valueToEvaluate){
        int count =0;
        for (E element:inputArray
             ) {
            if(element==valueToEvaluate) {
                count++;
            }
        }
        return count;
            }

public E[] removeValue(E valueToRemove){
return null;
}

public Integer countDuplicatesInMerge(E[] arrayToMerge,E valueToEvaluate){
return null;
}

public E getMostCommonFromMerge(E[] arrayToMerge){
        return null;

}
}
