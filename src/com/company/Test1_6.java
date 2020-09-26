package com.company;

import java.util.Scanner;

public class Test1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = in.nextInt();
        System.out.println("Enter y: ");
        int y = in.nextInt();
        if ( ((Math.abs(x) <= 2) && (y <= 4 && y >= 0)) || ((Math.abs(x) <= 4) && (y >= -3 && y <= 0)) )
            System.out.println("True");
        else
            System.out.println("False");
    }
}
