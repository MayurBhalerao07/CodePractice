package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MinMaxFromList {
    List<Integer> list = Arrays.asList(1,3,5,7,8,11,0);
     int min = list.get(0);
     int max = list.get(0);

    public int getMinValue(List<Integer> intList){
        for(Integer i : intList){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public int getMaxValue(List<Integer> intList){
        for(Integer i : intList){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    
    public int[] removeDupli() {
        
        int arrayInt[] = {1,1, 3, 5, 7,8,9};
        int newArray[] = new int[arrayInt.length];
        int temp =1;
        for(int i=0; i<arrayInt.length;i++) {
            if(arrayInt[i] == arrayInt[temp]){
                newArray[i]=arrayInt[i];
                temp++;
            }else{
             newArray[i] = arrayInt[temp];
            }

        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
    
    
    public static void main(String[] args) {

        MinMaxFromList mn = new MinMaxFromList();
        mn.removeDupli();
        System.out.println(mn.getMinValue(mn.list));
        System.out.println(mn.getMaxValue(mn.list));

        System.out.println(IntStream.range(0 , mn.list.size()).map(i->mn.list.get(i)).min().getAsInt());


    }
}
