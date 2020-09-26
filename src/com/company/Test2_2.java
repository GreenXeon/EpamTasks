package com.company;

import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = in.nextInt();
        System.out.println("Enter second number: ");
        int y = in.nextInt();
        System.out.println("Enter third number: ");
        int z = in.nextInt();
        System.out.println("Enter fourth number: ");
        int c = in.nextInt();
        System.out.println(max(min(x, y), min(z, c)));
    }

    public static int  max(int a, int b){
        if (a <= b) return b;
        else
            return a;
    }

    public static int min(int a, int b){
        if (a >= b) return b;
            else
                return a;
    }
}
