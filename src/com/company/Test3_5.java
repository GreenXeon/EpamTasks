package com.company;

import java.util.Scanner;

public class Test3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number e:");
        double e = in.nextDouble(), a = 2, sum = 0;
        for(int n = 1; a >= e; n++){
            a = 1/(Math.pow(2, n)) + 1/(Math.pow(3, n));
            sum+=a;
        }
        System.out.println(sum);
        for(int j = 0; j<255; j++)
            System.out.println((char)j);
    }
}
