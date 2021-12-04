package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E> {
    E[] array;
    public ArrayUtility(E[] array){
        this.array = array;
    }

    public E[] removeValue(E valueToRemove) {
        return (array = Arrays.stream(this.array)
                .filter(q-> !q.equals(valueToRemove))
                .toArray([]::new));
    }

    public E countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate) {
    }

    public E getNumberOfOccurrences(E valueToEvaluate) {
    }
}
