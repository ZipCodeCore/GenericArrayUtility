package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<E> {
    E[] array;
    public ArrayUtility(E[] array){
        this.array = array;
    }
//is it posssible to do this better without an unchecked cast?
    //maybe doing my own array conversion method?
    public E[] removeValue(E valueToRemove) {
        return Arrays
                .stream(this.array)
                .filter(q-> !q.equals(valueToRemove))
                .toArray(q ->  Arrays.copyOf(this.array,
                                this.array.length - getNumberOfOccurrences(valueToRemove)));
    }

    public Integer countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate) {
        return Math
                .toIntExact(Arrays
                        .stream(arrayToMerge)
                        .filter(q-> q.equals(valueToEvaluate))
                        .count() + getNumberOfOccurrences(valueToEvaluate));
    }

    public Integer getNumberOfOccurrences(E valueToEvaluate) {
        return Math
                .toIntExact(Arrays
                        .stream(this.array)
                        .filter(q-> q.equals(valueToEvaluate))
                        .count());
    }

    public E getMostCommonFromMerge(E[] arrayToMerge) {
        return Arrays
                .stream(arrayToMerge)
                .max(Comparator.comparing(this::getNumberOfOccurrences))
                .orElse(null);
    }
}
