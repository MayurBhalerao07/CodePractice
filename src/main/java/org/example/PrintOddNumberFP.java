package org.example;

import java.util.Arrays;
import java.util.List;

public class PrintOddNumberFP {

    public static void main(String[] args) {
        List<Integer> oddNumberList = Arrays.asList(2,4,5,6,7,77,88,99,33,11);
        System.out.println("***********OddNumber*************");
        printOddNumber(oddNumberList);
        System.out.println("***********OddNumber*************");

        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
        printCourses(courses);

        printCubeOfOddNumber(oddNumberList);
    }

    public static void printOddNumber(List<Integer> numbersList){

        numbersList.stream()
                .filter(num -> num%2==1)
                .forEach(System.out :: println);
    }

    public static void printCourses(List<String> coursesList){

        System.out.println("***********Print Courses*************");
        coursesList.stream().map(course -> course +" "+course.length())
                .forEach(System.out::println);
        System.out.println("***********Print Courses*************");


        System.out.println("***********Print Spring Courses*************");
        coursesList.stream().filter(s -> s.contains("Spring"))
                .forEach(System.out :: println);
        System.out.println("***********Print Spring Courses*************");

        System.out.println("***********Print Courses More then 4 Character");
        coursesList.stream().filter(s -> s.length() >= 4)
                        .forEach(System.out::println);
        System.out.println("***********Print Courses More then 4 Character");

    }

    public static void printCubeOfOddNumber(List<Integer> numberList){

        numberList.stream()
                .filter(num -> num%2 == 1)
                .map(c -> c * c * c)
                .forEach(System.out::println);
    }
}
