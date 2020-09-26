package com.company;

import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        int sum = 0, n = 0;
        while (n < a){
            n++;
            sum+=n;
        }
        System.out.println(sum);
    }
}
