package org.example;

public class String_reversal {
    public int getStringLength(String str){

        int getLength = 0;
        for(char c: str.toCharArray()) {
            getLength++;
        }
        return getLength;
    }

    public String reverseString(String str) {


        int getLength= getStringLength(str);
        String reversed="";

        for( int i = getLength-1;i>=0;i--){
            reversed=reversed.concat(String.valueOf(str.charAt(i)));


    }

        return reversed;

    }
}