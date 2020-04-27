package com.hasan.declaretive;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    /*static Map<String, Long> countFrequency(List<String> words) {
        Map<String, Long> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.merge(word, 1L, (oldValue, value) ->
                    oldValue + value
            );
        }

        return frequencyMap;
    }*/

    // OR

    static Map<String, Long> countFrequency(List<String> words) {

        return words
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", "World", "Bangladesh", "Dhaka", "Hello", "Java", "Lambda", "Java",
                "Hello", "World", "Bangladesh", "Dhaka", "Hello", "Java",
                "Lambda", "Java", "Bangladesh", "Dhaka", "Hello", "Java");

        Map<String, Long> wordFrequency = countFrequency(words);

        System.out.println(wordFrequency);

    }
}
