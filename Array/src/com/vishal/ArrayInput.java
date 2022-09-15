package com.vishal;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        //InPut
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+i+" value : ");
            arr[i] = input.nextInt();
        }
        //OutPut
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Value of "+i+" Index is : "+arr[i]);
        }
    }
}