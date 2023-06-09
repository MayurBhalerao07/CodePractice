package org.example;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        int x,y,temp;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        swapWithThirdVariable(x, y);
        swapWithOutThirdVariable(x, y);
    }

    private static void swapWithThirdVariable(int x, int y) {
        int temp;
        System.out.println("Before Swap :- "+ x +" "+ y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swap :- "+ x +" "+ y);
    }

    private static void swapWithOutThirdVariable(int x, int y){
        System.out.println("Before Swap :- "+ x +" "+ y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap :- "+ x +" "+ y);
    }
}
