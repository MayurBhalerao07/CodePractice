package com.java8.program;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindingMaximumNumber {
    public static void main(String[] args) {
        findMaximumByStream();
        findMaximumByLoop();
    }
    public static void findMaximumByStream() {
        Integer maxNumber = Stream.of(1,2,5,7,9,10,-1,15).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum Number is :- " + maxNumber);
    }
    public static void findMaximumByLoop(){
        int [] arr = new int[]{1,2,4,6,8,10,-1,15};
        int maxNumber = arr[0];
        for(int i=1; i< arr.length;i++){
            if(arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }
        System.out.println("Maximum Number is :- " + maxNumber);
    }
}
