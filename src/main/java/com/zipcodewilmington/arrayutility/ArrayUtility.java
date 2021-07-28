package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<SomeType> {

    private SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public Integer countDuplicatesInMerge(SomeType[] arrayToMerge, SomeType valueToEvaluate) {

        return null;
    }

    public SomeType getMostCommonFromMerge(SomeType[] arrayToMerge) {
        return null;
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
        for (Object element : array) {
            if (!element.equals(valueToRemove)) {
                arrayList.add((SomeType) element);
            }

        }
        return (SomeType[]) arrayList.toArray();
    }
}
