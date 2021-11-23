package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E>{
    E[] inputArray;
    public ArrayUtility(E[] inputArray){
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate ){
        E[] newArray = mergeArrays(arrayToMerge);
        return countDuplicates(valueToEvaluate,newArray);


    }

    private Integer countDuplicates(E valueToEvaluate,E[] newArray){
        Integer counter = 0;
        for(E element : newArray){
            if(element.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public E getMostCommonFromMerge(E[] arrayToMerge){
        Integer max = 0;
        E value = null;
        E[] newArray = mergeArrays(arrayToMerge);
        for(E element : newArray){
            Integer count = countDuplicates(element,inputArray);
            if(count>max){
                max = count;
                value = element;
            }
        }
        return value;

    }

    public Integer getNumberOfOccurrences(E valueToEvaluate){
        return countDuplicates(valueToEvaluate,this.inputArray);


    }

    public E[] removeValue(E valueToRemove) {
        Integer countRemove = getNumberOfOccurrences(valueToRemove);
        Integer counter = 0;
        E[] newArray = Arrays.copyOf(this.inputArray,this.inputArray.length-countRemove);
        for(E element : this.inputArray){
            if(!element.equals(valueToRemove)){
                newArray[counter++]=element;
            }
        }
        return newArray;

    }

    private E[] mergeArrays(E[] arrayToMerge){
        E[] newArray = Arrays.copyOf(this.inputArray,this.inputArray.length+arrayToMerge.length);
        for(int i = 0; i< arrayToMerge.length;i++){
            newArray[i+ this.inputArray.length] = arrayToMerge[i];
        }
        return newArray;
    }
}
