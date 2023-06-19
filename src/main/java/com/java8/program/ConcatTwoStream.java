package com.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoStream {

    public static void main(String[] args) {
        List<Integer> intList1 = Arrays.asList(1,3,5,6);
        List<Integer> intList2 = Arrays.asList(2,4,7);
        Stream<Integer> concatStream = Stream.concat(intList1.stream(),intList2.stream());
        concatStream.forEach(System.out ::println);
    }
}
