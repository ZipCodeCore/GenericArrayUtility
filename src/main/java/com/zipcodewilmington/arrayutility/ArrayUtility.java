package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <Object> {
    Object[] objects;

    public ArrayUtility(Object[] objects){
        this.objects= objects;

    }


    public int countDuplicatesInMerge(Object[] arrayToMerge, Object valueToEvaluate) {
        ArrayList<Object> added = new ArrayList<>(Arrays.asList(objects));
        int numOfOccurences = 0;
        Collections.addAll(added, arrayToMerge);

        for (Object o : added) {
            if (o == valueToEvaluate){
            numOfOccurences++;
            }
        }
        return numOfOccurences;

//        int addLength= objects.length + arrayToMerge.length;
//        Object[] merged = Arrays.copyOf(objects, addLength);
//
    }

    public Object getMostCommonFromMerge(Object[] arrayToMerge) {
        ArrayList<Object> added = new ArrayList<>(Arrays.asList(objects));
        Collections.addAll(added, arrayToMerge);

        Object mostPop= null;
        int most = Integer.MIN_VALUE;
        for (Object object : added) {
            if (getNumberOfOccurrences(object) > most){
                mostPop = object;
                most = getNumberOfOccurrences(object);
            }
        }
        return mostPop;
    }

    public int getNumberOfOccurrences(Object valueToEvaluate) {
        int numOfOccurences = 0;
        for (Object obj : objects) {
            if (obj == valueToEvaluate) {
                numOfOccurences++;
            }
        }
        return numOfOccurences;
    }

    public Object[] removeValue(Object valueToRemove) {
        ArrayList<java.lang.Object> newArray = new ArrayList<>(Arrays.asList(objects));
        newArray.removeAll(Collections.singleton(valueToRemove));
        Object[] edit = (Object[]) newArray.toArray();

        return edit;
    }
}
