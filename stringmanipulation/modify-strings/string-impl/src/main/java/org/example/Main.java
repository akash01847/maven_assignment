package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String_reversal object = new String_reversal();


        Scanner sc = new Scanner(System.in);

        String user_input= sc.nextLine();
        System.out.println( object.getStringLength(user_input));
        System.out.println( object.reverseString(user_input));
    }
}