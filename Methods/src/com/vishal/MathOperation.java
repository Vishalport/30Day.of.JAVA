package com.vishal;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Operation();
    }

    public static int Operation() {
        int ans;
        Scanner input = new Scanner(System.in);

        System.out.println("Please verify the operation...\n1. Add \n2. Sub \n3. Mul \n4. Div");
        int Option = input.nextInt();
        System.out.print("Number1 : ");
        int number1 = input.nextInt();
        System.out.print("Number2 : ");
        int number2 = input.nextInt();

        if (Option == 1) {
            ans = number1 + number2;
            System.out.print("your answer is : " + ans);
        }
        if (Option == 2) {
            ans = number1 - number2;
            System.out.println("your answer is : "+ans);
        }
        if(Option == 3) {
            ans = number1 * number2;
            System.out.println("your namswer is  : "+ans);
        }

        if (Option == 4 ) {
            ans = number1 / number2;
            System.out.println("your answer is  : "+ans);
        }
        return 1;
    }
}
