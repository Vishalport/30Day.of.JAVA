package com.vishal;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        PrintFactorial();
    }

    public static void PrintFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int UserInput = input.nextInt();
        int ans =1;

        if(UserInput < 0) {
            System.out.println("invalid Input");
            return;
        }
        for (int i = UserInput; i >=1; i--) {
            ans = ans * i;
        }
        System.out.println("Answer is : "+ans);
    }
}
