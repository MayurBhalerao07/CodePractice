package com.java8.program;

import java.util.Arrays;
import java.util.List;

public class IterateStreamByForEach {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Hello","Testing","For","Stream","Iterate");
        strList.stream().forEach(System.out::println);
    }
}
