package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

public E[] removeValue(E valueToRemove) {
        int numberOfOccurrence = getNumberOfOccurrences(valueToRemove);
    E[] newArray = Arrays.copyOf(inputArray, inputArray.length - numberOfOccurrence);
    int j = 0;
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i] != valueToRemove) {
            newArray[j] = inputArray[i];
            j++;
        }

    }
    return newArray;
}

public Integer countDuplicatesInMerge(E[] arrayToMerge,E valueToEvaluate){
int count=0;
int count1=0;
for(E element:arrayToMerge){
    if(element ==valueToEvaluate){
        count+=1;
    }
}
for(E elements:inputArray){
    if(elements==valueToEvaluate){
        count1+=1;
    }
}
return count+count1;
}

public E getMostCommonFromMerge(E[] arrayToMerge){
    List<E> input= new ArrayList<E>(Arrays.asList(inputArray));
   // List<E> merge= new ArrayList<E>(Arrays.asList(arrayToMerge));
    input.addAll(Arrays.asList(arrayToMerge));
    E mostCommon=null;
    int count=0;
    for (E element:input
         ) {
        if(getNumberOfOccurrences(element)>count){
            mostCommon=element;
            count=getNumberOfOccurrences(element);
    }
            }
    return mostCommon;
        }

}
