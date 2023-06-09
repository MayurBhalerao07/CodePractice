package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleHashMap {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(1,"abc");
        hashMap.put(2,"def");
        hashMap.put(3,"ghi");
        System.out.println(hashMap.size());
        System.out.println("while loop...");
        Iterator itr = hashMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>)itr.next();
            System.out.println("key :- "+ entry.getKey() + " value :- "+entry.getValue());
        }
        System.out.println("For loop :");
        for(Map.Entry entry:hashMap.entrySet()){
            System.out.println("key :- "+ entry.getKey() + " value :- "+entry.getValue());
        }
    }
}
