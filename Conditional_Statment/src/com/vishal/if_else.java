package com.vishal;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("what's your age : ");
        int age = input.nextInt();

        if(age>18) {
            System.out.println("Adult, your age is :"+age);
        }
        else  {
            System.out.println("you are not Adult");
        }

    }
}

