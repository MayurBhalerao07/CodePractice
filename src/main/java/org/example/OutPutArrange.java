package org.example;

import java.util.Scanner;

public class OutPutArrange {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String format = "";
                if(String.valueOf(x).length() !=3){
                    format = "0"+x;
                }
                StringBuilder builder = new StringBuilder(s1);
                int count = builder.length() ;
                if(count < 16){
                    int spaceCount = 16 - count;
                    for(int j=0; j<=spaceCount;j++){
                        builder.append(" ");
                    }
                }
                if(!format.equals("")){
                    System.out.println(builder+""+format);
                }else{
                    System.out.println(builder+""+x);
                }
            }
        }
}
