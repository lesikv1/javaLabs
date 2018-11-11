package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("y = ");
        double y = sc.nextDouble();
        System.out.print("\n");
        System.out.printf("a: %d, b: %d, c: %d, x: %.2f, y: %.2f ", a, b, c, x, y);
        System.out.print("\n");

        double t1 = ( 1/ (Math.pow(a, 2) * Math.pow(c, 2) + Math.pow(b, 2)) ) * (c * Math.log(b + c * x) - c/2 * Math.log(y));
        System.out.printf("t1 : %.2f", t1);
        double t2 = (1 / a) * Math.log(1 + Math.cos(a * x) / (a * x));
        System.out.print("\n");
        System.out.printf("t2 : %.2f", t2);
    }
}
