package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(number -> number % 2 == 1)
                .reduce((first, second) -> second)
                .orElse(0);
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce((first, last) -> (first.length() > last.length()) ? first : last)
                .orElse("");
    }

    public int getTotalLength(List<String> words) {
        return words.stream().mapToInt(String::length).reduce(0, Integer::sum);
    }
}
