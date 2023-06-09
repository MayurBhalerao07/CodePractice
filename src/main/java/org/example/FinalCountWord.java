package org.example;

import java.util.HashMap;
import java.util.Map;

public class FinalCountWord {

    public static void main(String[] args) {
        String str = "This is is done for for testing a a count of word word";
        String [] strArr = str.split(" ");
        HashMap<String , Integer> hashMap = new HashMap<>();
        for(int i=0; i<strArr.length; i++){
            if(hashMap.containsKey(strArr[i])){
                int count = hashMap.get(strArr[i]);
                hashMap.put(strArr[i] , count+1);
            }
            else{
                hashMap.put(strArr[i] , 1);
            }
        }
        System.out.println(hashMap);
    }
}
