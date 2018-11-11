package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        inputN.inputNdots();
       System.out.printf("%d, %d", inputN.NX(), inputN.NY());
       System.out.print("\n");
       System.out.printf("%d, %d, %d, %d", dataDots.maxY(), dataDots.minY(), dataDots.maxX(), dataDots.minX());
       System.out.print("\n");
        checkHit.hit(dataDots.maxX(), dataDots.maxY(), dataDots.minX(), dataDots.minY(), inputN.NX(), inputN.NY());
   }
}

class dataDots {
    static int Ax = -1;
    static int Ay = 0;
    static int Bx = 0;
    static int By = 1;
    static int Cx = 1;
    static int Cy = -1;
    static int Dx;
    static int Dy;

    public static int maxY () {
        int max = 0;
        if (Ay <= By) {
            max = By;
            if(By >= Cy) {
                max = By;
            } else {
                max = Cy;
            }
        } else if (Ay > By) {
            max = Ay;
            if(Ay >= Cy) {
                max = Ay;
            } else {
                max = Cy;
            }
        }
        return max;
    }
    public static int minY () {
        int min = 0;
        if (Ay >= By) {
            min = By;
            if(By <= Cy) {
                min = By;
            } else {
                min = Cy;
            }
        } else if (Ay < By) {
            min = Ay;
            if(Ay <= Cy) {
                min = Ay;
            } else {
                min = Cy;
            }
        }
        return min;
    }
    public static int maxX () {
        int max = 0;
        if (Ax <= Bx) {
            max = Bx;
            if(Bx >= Cx) {
                max = Bx;
            } else {
                max = Cx;
            }
        } else if (Ax > Bx) {
            max = Ax;
            if(Ax >= Cx) {
                max = Ax;
            } else {
                max = Cx;
            }
        }
        return max;
    }
    public static int minX () {
        int min = 0;
        if (Ax >= Bx) {
            min = Bx;
            if(Bx <= Cx) {
                min = Bx;
            } else {
                min = Cx;
            }
        } else if (Ax < Bx) {
            min = Ax;
            if(Ax <= Cx) {
                min = Ax;
            } else {
                min = Cx;
            }
        }
        return min;
    }
}

class inputN {
    static private int Nx;
    static private int Ny;
    public static void inputNdots() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nx = ");
        Nx = sc.nextInt();
        System.out.print("Ny = ");
        Ny = sc.nextInt();
    }
    public static int NX () {
        return Nx;
    }
    public static int NY () {
        return Ny;
    }
}

class checkHit {
    public static void hit(int maxX, int maxY, int minX, int minY, int nx, int ny) {
        if(nx < maxX && nx > minX && ny < maxY && ny > minY) {
            System.out.print("DOTS IS HIT");
        } else {
            System.out.print("DOTS IS DONT HIT");
        }
    }
}