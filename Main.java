package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] arr) {
        System.out.println("\t\tWelcome to the Test result.");

        Scanner input = new Scanner(System.in);
        System.out.println("\t\tEnter the student name : ");
        String name = input.nextLine();

        System.out.println("\t\tEnter the mark's of math : ");
        int a = input.nextInt();

        System.out.println("\t\tEnter the mark's of physcs : ");
        int b = input.nextInt();

        System.out.println("\t\tEnter the mark;s of chemistry : ");
        int c = input.nextInt();

        System.out.println("\t\tCongratulation your have input your student mark's ");

        int cal = a + b + c;

        System.out.print("name : ");
        System.out.println(name);

        System.out.print("total number in test is  : ");
        System.out.println(cal);
    }
}
