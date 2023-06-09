package org.example;

public class StringReversalNew {

    public static void main(String[] args) {

        String input = "TestingForReverse";
        char[] arr = input.toCharArray();

        reverseWithNewString(arr);
        reverseMethodSecond(arr);
    }

    private static void reverseWithNewString(char[] arr) {
        String temp = "";
        for(int i=0; i<arr.length; i++){
          temp  = arr[i] + temp;
        }
        System.out.println(temp);
    }

    private static void reverseMethodSecond(char[] arr) {
        String tempNew = "";
        for(int i = arr.length-1; i>=0; i--){
            tempNew = tempNew+ arr[i];
        }
        System.out.println(tempNew);
    }

}