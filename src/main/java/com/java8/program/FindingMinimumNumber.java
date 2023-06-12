package com.java8.program;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindingMinimumNumber {
    public static void main(String[] args) {
        minValueFromStream();
        minValueFromLoop();

    }
    private static void minValueFromStream() {
        Integer minValue = Stream.of(1,3,4,6,78,9,0).min(Comparator.comparing(Integer :: valueOf)).get();
        System.out.println("Minimum value is :- " + minValue);
    }
    private static void minValueFromLoop(){
        Integer [] arr = new Integer[]{1,3,6,7,9,-1};
        Integer minValue = arr[0];
        for(int i=1;i<arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
    }
}
