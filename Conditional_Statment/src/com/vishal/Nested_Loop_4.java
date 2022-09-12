/*
 print the pattern like :
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
 0 1 0 1 0 1

 */

package com.vishal;

public class Nested_Loop_4 {
    public static void main(String[] args) {
        int row = 5;
        int number = 1;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <=i ; j++) {
                int sum = i + j;
                if(sum%2==0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
