package com.vishal;

import java.util.Scanner;

public class HelloName<Static> {
    public static void main(String[] args) {
        MyName();
    }

    public static void MyName() {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("What's Your Name : ");
        name = input.nextLine();
        System.out.println("Hello "+name);
    }
}

