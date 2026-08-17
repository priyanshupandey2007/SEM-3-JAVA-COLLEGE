package com.campany;

import java.util.Scanner;

class class1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.println("Enter your number");
         int a  = sc.nextInt();
         System.out.println(a);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Ascending Order:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }


        System.out.println("Descending Order:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }


    }
}

