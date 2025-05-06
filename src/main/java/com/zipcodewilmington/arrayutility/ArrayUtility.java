package com.zipcodewilmington.arrayutility;

import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <SomeType extends Object> {

    SomeType[] array;

    public ArrayUtility(SomeType[] inputArray) {
        array = inputArray;
    }

    public SomeType[] removeValue(SomeType valueToRemove) {
        List<SomeType> arrayAsList = new ArrayList<>();
        for (SomeType element : array) {
            if (!element.equals(valueToRemove)) {
                arrayAsList.add(element);
            }
        }
        SomeType[] newArray = Arrays.copyOf(array, arrayAsList.size());
        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (array[i].equals(valueToRemove)) {
                newArray[i] = array[j + 1];
                j++;
            }
            else if (array[j].equals(valueToRemove)) {
                newArray[i] = array[j + 1];
            }
            else {
                newArray[i] = array[j];
            }
        }
        return newArray;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int numberOfOccurences = 0;
        for (SomeType element : array) {
            if (element.equals(valueToEvaluate)) {
                numberOfOccurences++;
            }
        }
        return numberOfOccurences;
    }

    public SomeType getMostCommonFromMerge(SomeType[] arrayToMerge) {
        //List<SomeType> listOfCommonElements = new ArrayList<>();
        List<SomeType> arrayAsList = new ArrayList<>(Arrays.asList(array));
        for (SomeType element : arrayToMerge) {
            arrayAsList.add(element);
        }
//        int outerBound = 0;
//        if (arrayToMerge.length < array.length) {
//            outerBound = arrayToMerge.length;
//        }
//        else {
//            outerBound = array.length;
//        }
//        for (int i = 0; i < outerBound; i++) {
//            if (array[i].equals(arrayToMerge[i])) {
//                listOfCommonElements.add(array[i]);
//            }
//        }
        int numberOfMostCommonElement = 0;
        SomeType mostCommonElement = null;
        for (SomeType eachElement : arrayAsList) {
            int numberOfOccurences = getNumberOfOccurrences(eachElement);
            if (numberOfOccurences > numberOfMostCommonElement) {
                mostCommonElement = eachElement;
                numberOfMostCommonElement = numberOfOccurences;
            }
        }
        return mostCommonElement;
    }

    public Integer countDuplicatesInMerge(SomeType[] arrayToMerge, SomeType valueToEvaluate) {
        List<SomeType> arrayAsList = new ArrayList<>(Arrays.asList(array));
        for (SomeType element : arrayToMerge) {
            arrayAsList.add(element);
        }
        int numberOfOccurences = 0;
        for (SomeType eachElement : arrayAsList) {
            if (eachElement.equals(valueToEvaluate)) {
                numberOfOccurences++;
            }
        }
        return numberOfOccurences;
    }
}
