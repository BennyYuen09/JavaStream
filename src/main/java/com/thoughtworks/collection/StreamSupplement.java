package com.thoughtworks.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Integer::compare)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        return numbers.stream().mapToInt(i -> i).average().orElse(); //IntStream
    }

    public int getMaxValue(List<Integer> numbers) {
        return 0;
    }

}
