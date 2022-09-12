package com.vishal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Variables
        int a = 10;
        int b = 20;
        int  sub = a + b;
        System.out.println("sum is : "+sub);
    // User input
        System.out.print("\nInput name : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name);

        System.out.print("\nInput Full Name : ");
        Scanner input2 = new Scanner(System.in);
        String FullName = input2.nextLine();
        System.out.println(FullName);


        System.out.print("\nInput Number : ");
        Scanner input3 = new Scanner(System.in);
        int number = input3.nextInt();
        System.out.println(number);
    }
}
