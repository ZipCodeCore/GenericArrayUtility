package com.zipcodewilmington.arrayutility;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public T countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        ArrayList<T> jawner = new ArrayList<>(Arrays.asList(inputArray));
        ArrayList<T> merge = new ArrayList<>(Arrays.asList(arrayToMerge));
        jawner.addAll(merge);
        Integer result = Collections.frequency(jawner, valueToEvaluate);
        return (T) result;
    }

    public T[] removeValue(T valueToRemove) {
        ArrayList<T> jawner = new ArrayList<>(Arrays.asList(inputArray));
        jawner.removeIf(T -> T.equals(valueToRemove));
        return (T[]) jawner.toArray();
    }

    public T getNumberOfOccurrences(T valueToEvaluate) {
        ArrayList<T> jawner = new ArrayList<>(Arrays.asList(inputArray));
        Integer result = Collections.frequency(jawner, valueToEvaluate);
        return (T) result;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> jawner = new ArrayList<>(Arrays.asList(inputArray));
        ArrayList<T> merge = new ArrayList<>(Arrays.asList(arrayToMerge));
        jawner.addAll(merge);
//        Integer result = Stream.of(jawner).collect(Collectors.groupingBy(Integer::valueOf))
//                .values()
//                .stream()
//                .sorted((a, b) -> b.size() - a.size())
//                .collect(Collectors.toList()).get(0).get(0);
        List<T> sorted = jawner.stream()
                    .sorted()
                    .collect(Collectors.toList());
        return null;
    } // Thought process here - sorted the array, use Lamda? maybe? to
}     // to check for most commong object
