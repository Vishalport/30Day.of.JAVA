package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n\nWelcome Rock-Paper-Scissors Game in Java");
        System.out.println("\t\t\t1. Rock\n\t\t\t2. Paper\n\t\t\t3. Scissor");

        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Enter your choice : ");
        int user = input.nextInt();

        System.out.println("Value Form User : ");
        System.out.println(user);

        int max = 1;
        int min = 3;
        //Generate random double value from 200 to 400
        System.out.println("Value Form Computer : ");
        int a = (int)Math.random()*(max-min+1)+min;
        System.out.println(a);

        if(user == a ) {
            System.out.println("Both Value Is Same ");
            System.out.println("Winner Can Not be Found ");
        }
        else if(a>user){
            System.out.println("Computer Wine this Game !!");
        }
        else if(user>a) {
            System.out.println("User Win this Game");
        }

    }
}
