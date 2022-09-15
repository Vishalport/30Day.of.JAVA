// Q. Enter the 11 length of array and the Target result will be found:  Index (5 to 9).
// If the Target value is not inside the Range print the  only MAX value

package com.vishal;

import java.util.Collections;
import java.util.Scanner;

public class LinearSearch_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = input.nextInt();
        for (int i = 1; i < size; i++) {
            System.out.print("Enter the "+i+ " Index number : ");
            int number = input.nextInt();
        }

        LinearSearch(5, 9);
    }
    // Algo...
    public static void LinearSearch(int Start, int End) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Target number that you want to search : ");
        int Target = input.nextInt();

        for (int i = Start; i < End; i++) {
            if (i == Target) {
                System.out.println("Your Target Number is at Index :"+i);
            }

        }

        System.out.print("the MAX value inside the Array is : ");
        System.out.println(Math.max(Start, End));

    }
}
