package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicateExample2 {
    public static void main(String[] args) {
        int array[] = {4,6,3,5,4,6,9,8};
        Arrays.sort(array);
        int length = array.length;
        int newArray[] = new int[length];
        int j =0;

        for(int i=0;i<length-1;i++){
            if(array[i] != array[i+1]){
                newArray[j++] = array[i];
            }
        }
        newArray[j++] = array[length-1];
        System.out.println(Arrays.toString(newArray));

        for(int i=0;i<j;i++){
            array[i] =newArray[i];
        }
        System.out.println(Arrays.toString(array));

        for(int i=0;i<j;i++){
            System.out.print(array[i]+" ");
        }

    }
}
