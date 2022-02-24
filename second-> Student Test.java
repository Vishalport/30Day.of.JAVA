package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the project...");
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t1.\tINPUT MARK'S and SHOW THE RESULT ");
        System.out.println("\t\t2.\tEXIT");

        System.out.println("Enter your choice : ");
        int choice = input.nextInt();
        int cal;
        int Roll;
        int Physics;
        int Chemistry;
        int Math;
        int Hindi;
        int English;

        int first = 300;
        int second = 200;

        switch (choice) {
            case 1 : {
                System.out.println("Enter the name of the student : ");
                String name = input.next();

                System.out.println("Enter the student Roll :");
                Roll = input.nextInt();

                System.out.println("Enter the mark's of Physics : ");
                Physics = input.nextInt();

                System.out.println("Enter the mark's of Math : ");
                Math = input.nextInt();

                System.out.println("Enter the mark's of Chemistry : ");
                Chemistry = input.nextInt();

                System.out.println("Enter the mark's of Hindi : ");
                Hindi = input.nextInt();

                System.out.println("Enter the mark's of English : ");
                English = input.nextInt();

                cal = Physics + Math + Chemistry + Hindi + English;

                if(cal > 1 ) {
                    System.out.print("student name is :");
                    System.out.println(name);
                    System.out.print("Student roll is ");
                    System.out.println(Roll);

                    System.out.print("the total mark's of the student is : ");
                    System.out.println(cal);

                    if (cal > first) {
                        System.out.println("position is first division..!!");
                    }
                    else if(cal > second) {
                        System.out.println("position is second division..!! ");
                    }

                    else {
                        System.out.println("position is third division..!!");
                    }

                }
            }
            break;
            case 2 : {
                System.out.println("THANK YOU");
            }
            default: {
                System.out.println(" ");
            }

        }
    }
}
