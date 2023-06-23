package com.java8.program;

import java.util.*;

public class SortingList {

    public static void main(String arg[]){
      List<Integer> intList = Arrays.asList(1,4,3,2,5,7,9);
      intList.stream().sorted().forEach(System.out::print);
      System.out.println();

      List<Integer> intList1 = Arrays.asList(1,4,3,2,5,7,9);
      Collections.sort(intList1);
      System.out.print(intList1);
        System.out.println();

        Set<Integer>  sortedSet = new HashSet<>(intList);
        System.out.print(sortedSet);
    }
}
