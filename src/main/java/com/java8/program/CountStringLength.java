package com.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringLength {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Hello","Interview","Testing","Count" ,"for","Stream");
        countFromStream(strList);
        countFromLoop(strList);
    }

    private static void countFromStream(List<String> strList) {
        long count = strList.stream().filter(x -> x.length() > 3).count();
        System.out.println("String count with greater than 3 digit :" + count);
    }

    private static void countFromLoop(List<String> strList){
        int count = 0;
        for(int i=0; i<strList.size(); i++){
            if(strList.get(i).length() > 3){
                ++count;
            }
        }
        System.out.println("String count with greater than 3 digit : " + count);
    }
}
