package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<GivenArray> {

    GivenArray[] array;

    public ArrayUtility(GivenArray[] input) {
        this.array = input;
    }

    public Integer countDuplicatesInMerge(GivenArray[] arrayToMerge, GivenArray valueToEvaluate) {
        int count = 0;
        for (GivenArray givenArray : arrayToMerge) {
            if (givenArray == valueToEvaluate){ //if given array has dupe, increase count by one
                count++;
            }
        }
            for (GivenArray givenArray : array) {
                if (givenArray == valueToEvaluate){ //if array has dupe increase count by 1
                    count++;
                }
            }

        return count;
    }

    public GivenArray getMostCommonFromMerge(GivenArray[] arrayToMerge) {
        int count = 0;
        GivenArray givenCommonArray = null;

        for (GivenArray givenArray : arrayToMerge) {
            if (getNumberOfOccurrences(givenArray) > count) {
                count += getNumberOfOccurrences(givenArray);
                givenCommonArray = givenArray;
            }
        }
        return givenCommonArray;
    }

    public Integer getNumberOfOccurrences(GivenArray valueToEvaluate) {
        int count = 0;
        for (GivenArray givenArray : array) {
            if (valueToEvaluate.equals(givenArray)) {
                count++;
            }
        }
        return count;
    }

    public GivenArray[] removeValue(GivenArray valueToRemove) {
        ArrayList<GivenArray> notRemovedArray = new ArrayList<>();

        for (GivenArray givenArray : array) {
            if ( givenArray != valueToRemove){
                notRemovedArray.add(givenArray); //if the value to be removed is not equal to value in given array, add the value to not removed.
            }
        }
        return notRemovedArray.toArray(Arrays.copyOf(array, notRemovedArray.size()));
    }
}
