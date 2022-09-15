package com.vishal;

import java.util.Scanner;

public class ArrayInput_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Student's of the Student : ");
        int S_Size = input.nextInt();

        for (int i = 1; i < S_Size; i++) {
            System.out.print("Enter the "+i+" Student name : ");
        }

    }
}
