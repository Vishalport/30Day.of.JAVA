package com.vishal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Operation();
    }

    public static void Operation() {
        int ans=0;
        Scanner input = new Scanner(System.in);
        System.out.println("\n1. ADD \n2. SUB \n3. DIV \n4. MUL");
        System.out.print("what operation you want to perform....");
        int option = input.nextInt();
        System.out.print("number of element : ");
        int element = input.nextInt();
        for (int i = 1; i < element+1; i++) {
            System.out.print("enter the Number "+i+" : ");
            int number = input.nextInt();
            switch(option) {
                case 1 -> {
                  ans = number + ans;
                }
                case 2 -> {
                    ans = ans - number;
                }
                case 3 -> {
                        ans = number / ans;
                }
                case 4 -> {
                    ans = ans * number;
                }
                default -> {
                    System.out.println("invalid input..");
                }
            }
        }
        System.out.println("total : "+ans);
    }
}