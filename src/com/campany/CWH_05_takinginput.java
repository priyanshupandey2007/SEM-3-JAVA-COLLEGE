package com.campany;

import java.util.Scanner;

public class CWH_05_takinginput {


    public static void ascending(int n) {
        if (n == 0) {
            return;
        }

        ascending(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {

        System.out.println("Taking input from the user!!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Ascending Order:");
        ascending(n);

        sc.close();
    }
}