package com.java8.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,4,3,2,5,6,4);
        removeDupFromStream(intList);
        removeDupFromLoop(intList);
        removeDuplicatesWithLoop(intList);
    }
    private static void removeDuplicatesWithLoop(List<Integer> intList) {
        Integer intArray[] = intList.toArray(new Integer[intList.size()]);
        Arrays.sort(intArray);
        int arrLength = intArray.length;
        Integer newArray[] = new Integer[arrLength];
        int j=0;
        for(int i=0; i<arrLength-1;i++){
            if(intArray[i] != intArray[i+1]){
                newArray[j++] = intArray[i];
            }
        }
        newArray[j++] = intArray[arrLength-1];
        System.out.println(Arrays.toString(newArray));

        for(int i=0; i<j; i++){
            intArray[i] = newArray[i];
        }
        System.out.println(Arrays.toString(intArray));
        for(int i=0; i<j; i++){
            System.out.print(intArray[i]+",");
        }
    }
    private static void removeDupFromStream(List<Integer> intList) {
        intList.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
    private static void removeDupFromLoop(List<Integer> intList){
        Collections.sort(intList);
        List<Integer> newList = new ArrayList<>();
        for(Integer i : intList){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
    }
}

