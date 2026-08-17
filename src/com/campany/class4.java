package com.campany;

import java.util.Arrays;
import java.util.Scanner;
public class class4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers in the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(  arr[i] + " " );


        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println();
        System.out.println("Total sum is: " + sum);

        sc.close();
    }

    }

