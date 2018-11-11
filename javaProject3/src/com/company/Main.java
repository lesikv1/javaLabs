package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Task1.subTask();
	 Task2.subTask();
        Task3.subTask();
    }
}

class Task1 {
    public static void subTask () {
        int result = 0;
        for(int i = 1; i < 50; i++) {
            for(int j = 1; j < 10; j++){
                result = 1 / j + i;
            }
        }
        System.out.print(" \n ");
        System.out.print("answer for first task = ");
        System.out.printf("%d", result);
    }
}

class Task2 {
    public static void subTask () {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        while (a != 0) {
            System.out.print("\n");
            System.out.print("input number = ");
            a = sc.nextInt();
            System.out.print("\n");
        }
    }
}

class Task3 {
    private static int x;
    private static int n;
    public static void subTask (){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt();
        int result = x;

        for( int i = 1; i < n; i++) {
            System.out.print("\n");
            result += funcUp(x, i) / funcDown(i);
        }
        System.out.print("\n");
        System.out.printf("%d", result);
    }
    private static int funcUp (int x, int i){
        int result;
        result = (int) Math.pow(x, i);
        return result;
    }
    private static int funcDown (int i){
        int result = 1;
        for(int j = 1; j < i; j++) {
            result += j;
        }
        return result;
    }
}