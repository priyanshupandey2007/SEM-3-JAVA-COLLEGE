// make a java code in which we have to take a number from user as a input and return the number of digits
package Class_Work;

import java.util.Scanner;

class Day_4 {

    public static int countDigits(int num) {
        int count = 0;

        if (num == 0) {
            return 1;
        }

        num = Math.abs(num);

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = countDigits(number);

        System.out.println("Number of digits: " + result);

        sc.close();
    }
}