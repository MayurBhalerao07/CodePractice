package com.java8.program;

import java.util.Arrays;
import java.util.List;

public class PrintStringFromListGreaterThen3Length {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Hello" , "Testing","For","Java8");
        getValueFromStream(strList);
        getValueFromLoop(strList);
    }

    private static void getValueFromStream(List<String> strList) {
        strList.stream().filter(x-> x.length() > 3).forEach(System.out::println);
    }

    private static void getValueFromLoop(List<String> strList){
        for(int i=0; i<strList.size(); i++){
            if(strList.get(i).length()>3){
                System.out.println(strList.get(i));
            }
        }

    }


}

