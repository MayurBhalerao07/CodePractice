package com.java8.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply3ToAllListElements {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,3,5,6,7,9);
        multiplyByStream(intList);
        multiplyByLoop(intList);
    }

    private static void multiplyByStream(List<Integer> intList) {
        System.out.println(intList.stream().map(x-> x*3).collect(Collectors.toList()));
    }

    private static void multiplyByLoop(List<Integer> intList){
        List<Integer> newList = new ArrayList();
        for(int i=0; i< intList.size(); i++){
            newList.add(intList.get(i)*3);
        }
        System.out.println(newList);
    }
}
