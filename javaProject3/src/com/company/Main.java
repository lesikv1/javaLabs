package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	 Task1.subTask();
//	 Task2.subTask();
	 Task3.subTask();
    }
}

class Task1 {
    public static void subTask () {
        double result = 0;
        for(int i = 1; i <= 50; i++) {
            for(int j = 1; j <= 10; j++){
                result += 1.0 / (j + i);
            }
        }
        System.out.print(" \n ");
        System.out.print("answer for first task = ");
        System.out.printf("%f", result);
    }
}

class Task2 {
    public static void subTask () {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        while (a != 0) {
            System.out.print("\n");
            System.out.print("input number module = ");
            a = sc.nextInt();
            System.out.print("\n");
            if(a > 0) {
                System.out.printf("answer from module = %d", a);
            } else {
                System.out.printf("answer from module = %d", a * -1);
            }
            System.out.print("\n");
        }
    }
}

class Task3 {
    private static double x;
    private static double n;
    private static double exp;

    static double Factorial(int n){
        double result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void subTask (){
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        x = sc.nextDouble();
        System.out.print("step = ");
        n = sc.nextDouble();
//        System.out.print("exp = ");
//        exp = sc.nextDouble();
        double result = 0.0;
        int step = 1;

        for( int i = 1; i < n; i++) {
            System.out.print("\n");
           result += Math.pow(x, step) / Factorial(step);
            step += 2;
        }
        System.out.print("\n");
        System.out.printf("%f", result);
        System.out.print("\n");
        System.out.printf("%f", Math.sinh(x));
    }
}