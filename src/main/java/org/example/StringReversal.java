package org.example;

public class StringReversal {

    public static void main(String[] args) {
        String originalString = "Testing My String Reverseee";
        System.out.println("Hello world!");

        System.out.println("Orignal String :- " + originalString);
        System.out.println("Reversed String :- "+ reverseString(originalString));

        System.out.println("reverseSecond :- " + reverseSecond(originalString));
    }

    public static String reverseString(String orignalString){
        char[] arr = orignalString.toCharArray();
        char temp;
        for(int i=0 , j=arr.length-1; i<(arr.length/2);i++,j--){
              temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
        }
        return new String(arr);
    }

    public static String reverseSecond(String orignalString){
        StringBuilder sb = new StringBuilder(orignalString);
        sb.reverse();
        return sb.toString();
    }
}