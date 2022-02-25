package com.company;

public class Main {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else if ( x==y) {
            z = x/y;

        }
        else {
            z = (x +y) * 5;

        }
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);  // calling method...
        System.out.println("x is < y");
        System.out.println(c);


        int a2 = 10;
        int b2 = 10;
        int c3;
        c3 = logic(a,b);
        System.out.println("x and y are equal...!");
        System.out.println(c3);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1); // calling method...
        System.out.println("x is > y ");
        System.out.println(c1);
    }
}
