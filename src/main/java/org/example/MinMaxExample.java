package org.example;

public class MinMaxExample {

    public static void main(String[] args) {
        int intArray[] = {1,3,4,5,6,7,8,9,0,-5,50,11,55};
        int min =intArray[0];
        int max = intArray[0];
        for(int i=1;i<intArray.length;i++){
            if(intArray[i]<min){
                min = intArray[i];
            }
        }
        for(int i=1;i<intArray.length;i++){
            if(intArray[i]>max){
                max = intArray[i];
            }
        }
        System.out.println("Min from array :-"+ min);
        System.out.println("Max from array :-"+ max);
    }
}
