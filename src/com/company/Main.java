package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double z;
        System.out.println("Enter a,b,c:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int h, min, sec;
        //z = ((b + Math.sqrt(b*b + 4*a*c))/2 - Math.pow(a, 3) + Math.pow(b, -2));
        h = a / 3600;
        min = (a % 3600) / 60;
        sec = (a % 3600) % 60;
        System.out.println(h + " hours " + min + " min " + sec + " sec.");
    }
}
