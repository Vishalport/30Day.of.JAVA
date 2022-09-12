/*
 print the pattern like :
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15

 */

package com.vishal;

public class Nested_Loop_3 {
    public static void main(String[] args) {
        int row = 4;
        int number = 1;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
    }
}
