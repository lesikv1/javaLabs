package com.company;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

      System.out.print("Dots figure\n");
      System.out.printf("A(%f,%f);\n", dot.Ax, dot.Ay);
      System.out.printf("B(%f,%f);\n", dot.Bx, dot.By);
      System.out.printf("C(%f,%f);\n", dot.Cx, dot.Cy);
      System.out.printf("D(%f,%f);\n", dot.Dx, dot.Dy);
      System.out.printf("E(%f,%f);\n", dot.Ex, dot.Ey);
      System.out.printf("R(%f,%f);\n", dot.Rx, dot.Ry);

      System.out.print("Input dots\n");
       inputN.inputNdots(sc);
       System.out.printf("N(%f,%f)", inputN.NX(), inputN.NY());
      checkHit.hit(dot.Ax, dot.Ay, dot.Bx, dot.By, dot.Cx, dot.Cy, dot.Ex, dot.Ey, dot.Rx, dot.Ry, inputN.NX(), inputN.NY());

      task2.func(sc);
       Task3.subTask(sc);
   }
}

class dot {
    private static int size = 11;
    // SQUARE
    // Dots for A
    public  static double Ax = -1.0;
    public static double Ay = 0.0;
    // Dots for B
    public  static double Bx = -1.0;
    public static double By = 1.0;
    // Dots for C
    public  static double Cx = 0.0;
    public static double Cy = 1.0;
    // Dots for D
    public  static double Dx = 0.0;
    public static double Dy = 0.0;
    // Dots for E
    public  static double Ex = 1.0;
    public static double Ey = 0.0;
    // Dots for R
    public  static double Rx = 0.0;
    public static double Ry = -1.0;
}

class inputN {
    public static double Nx;
    public static double Ny;
    public static void inputNdots(Scanner sc) {
        System.out.printf("Nx = ");
        Nx = sc.nextDouble();
        System.out.printf("Ny = ");
        Ny = sc.nextDouble();
    }
    public static double NX () {
        return Nx;
    }
    public static double NY () {
        return Ny;
    }
}

class checkHit {
    public static void hit(double ax, double ay, double bx, double by, double cx, double cy, double ex, double ey, double rx, double ry, double nx, double ny) {
//        nx + ny == 1 && nx >= 0 && ny <= 0;
        double x, y, r;
        boolean check = false;
        x = nx;
        y = ny;
        r = Math.pow(x, 2) + Math.pow(y, 2);
        if(r <= 1 && x >= 0 && y <= 0) {
            System.out.print("DOTS IS HIT");
            check = true;
        }
        if(nx <= 0 && nx >= ax && nx >= bx && ny <= by && ny <= cy) {
            System.out.print("DOTS IS HIT");
            check = true;
        }

        if (check == false) {
            System.out.print("DOTS IS DONT HIT");
        }
    }
}

class task2 {

    public static double F(double x, Scanner sc) {
        int input;
        System.out.print("x = ");
        input = sc.nextInt();
        double result = 0.0;
        if (input > 0) {
            result = Math.sinh(x);
        }
        if(input < 0) {
            result = Math.pow(x, 2);
        }
        if(input == 0) {
            double e = 2.7182;
            result = Math.pow(e, x);
        }
        return result;
    }

    public static void func(Scanner sc) {
        double x, y, result = 0.0;
        System.out.print("\n");
        System.out.print("x = ");
        x = sc.nextInt();
        System.out.print("\n");
        System.out.print("y = ");
        y = sc.nextInt();

        if(x > y) {
            result = Math.sqrt(F(x, sc) - y) + Math.tan(F(x, sc));
        } else if(x < y){
            result = Math.pow(y - F(x, sc), 3) + Math.cos(F(x, sc));
        } else if(y == x){
            result = Math.pow(y + F(x, sc), 2) + Math.pow(x, 3);
        }
        System.out.print("\n");
        System.out.print(result);
    }
}

class Task3 {
    public static void subTask(Scanner sc) {
        int x;
        System.out.print("x = ");
        x = sc.nextInt();

        switch (x) {
            case 9:
            case 10:
                System.out.print("\n");
                System.out.print("ZAVTRAC");
                break;
            case 12:
            case 13:
                System.out.print("\n");
                System.out.print("OBED");
                break;
            default:
                System.out.print("\n");
                System.out.print("DELAY SO HOCHE");
        }
    }
}