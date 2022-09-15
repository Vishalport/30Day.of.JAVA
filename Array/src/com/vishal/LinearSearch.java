package com.vishal;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+i+" Value : ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the number to search in the array (X) : ");
        int x  = input.nextInt();
        // working Algo..
        for (int i = 0; i <arr.length; i++) {
            if (x == arr[i]) {
                System.out.println(arr[i]+" Is at Index : "+i);
            }
        }
    }
}
