package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("List with duplicate :- "+numbers);
        ArrayList<Integer> integerArrayList = removeDuplicate(numbers);
        System.out.println("List without duplicate :- "+ integerArrayList);
    }
    private static <T> ArrayList<T> removeDuplicate(ArrayList<T> tArrayList){
        ArrayList<T> newList = new ArrayList<T>();
        for(T t : tArrayList) {
           if(!newList.contains(t)){
               newList.add(t);
           }
        }
        return newList;
    }
}
