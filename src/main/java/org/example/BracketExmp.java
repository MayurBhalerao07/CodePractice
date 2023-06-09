package org.example;

import java.util.Scanner;

public class BracketExmp {
    public static void main(String[] args) {

        String[] strArray= new String[]{"(",")","{","}","[","]"};
        Scanner sc = new Scanner(System.in);
        sc.next();

        if(sc.equals("(){}[]"))
            System.out.println(true);

        else if(sc.equals("({[]})"))
            System.out.println(true);

        else if(sc.equals("{[()]}"))
            System.out.println(true);

        else
            System.out.println(false);



        for (int i = 0; i < strArray.length; i++) {
          switch (strArray[i]){

              case "(" : {
                  break;
              }
          }
        }



    }
}
