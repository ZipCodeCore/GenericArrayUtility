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
//is it posssible to do this better without an unchecked cast?
    //maybe doing my own array conversion method?
    public E[] removeValue(E valueToRemove) {
        return (this.array = (E[]) Arrays.stream(this.array)
                .filter(q-> !q.equals(valueToRemove))
                .toArray());
    }

    public int countDuplicatesInMerge(E[] arrayToMerge, E valueToEvaluate) {
        return Math
                .toIntExact(Arrays
                        .stream(arrayToMerge)
                        .filter(q-> !q.equals(valueToEvaluate))
                        .count());
    }

    public int getNumberOfOccurrences(E valueToEvaluate) {
        return Math
                .toIntExact(Arrays
                        .stream(this.array)
                        .filter(q-> !q.equals(valueToEvaluate))
                        .count());
    }

    public E getMostCommonFromMerge(Integer[] arrayToMerge) {
        return Arrays
                .stream(this.array)
                .max()
    }
}
