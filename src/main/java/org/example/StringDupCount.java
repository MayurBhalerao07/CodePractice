package org.example;

public class StringDupCount {
    public static void main(String[] args) {
        String str = "aaabbccaadd";
        char[] arr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        char lastChar = arr[0];
        for(int i=1; i<arr.length; i++){
            if(lastChar == arr[i]){
                count++;
            }
            else{
                stringBuilder.append(lastChar);
                stringBuilder.append(count);
                stringBuilder.append(",");
                count = 1;
            }
            lastChar = arr[i];
        }
        stringBuilder.append(lastChar);
        stringBuilder.append(count);
        System.out.println(stringBuilder);
    }
}
