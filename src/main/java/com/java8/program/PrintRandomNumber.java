package com.java8.program;

import java.util.Random;

public class PrintRandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

}
