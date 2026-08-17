package com.campany;

import java.util.Scanner;

public class Mainn1 {
    static String reverse(String str) {


        if (str.length() <= 1) {
            return str;
        }

        // Recursive call
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = reverse(str);

        System.out.println("Reversed string: " + result);
    }
}
