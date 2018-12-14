package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
//        Task1.inputArray(random, sc);
//        Task2.subTask(random, sc);
        Task4.subTasks(sc);
//        Task3.subTasks(sc);
    }
}

class Task1 {
    public static void inputArray(Random random, Scanner sc) {
        int length;
        System.out.print("length array task 1 = ");
        length = sc.nextInt();
        System.out.print("\n");
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = -27 + random.nextInt(9 - (-27));
        }

        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.print("\n");

        System.out.print("result 1.1 summa = ");
        int result = 0;
        for (int i = 0; i < length; i++) {
            if(array[i] > 0) {
                result += array[i];
            }
        }
        System.out.print(result);
        System.out.print("\n");
        result = array[0] - array[1];
        System.out.print("result 1.2 = ");
        System.out.print(result);
        System.out.print("\n");
    }

}
//    public static void subTask1() {
//        int result = 0;
//        for(int i = 0; i < array().length; i++) {
//            if(array()[i] > 0) {
//                result += array()[i];
//            }
//        }
//        System.out.print("\n");
//        System.out.print("result sum positive = ");
//        System.out.printf("%d", result);

//        int num = -27 + random.nextInt(9 - (- 27));
//                System.out.printf("%d", num);


//    public static void subTask2() {
//        int result = 0;
//        result = array()[1] - array()[2];
//        System.out.print("\n");
//        System.out.print("result composition = ");
//        System.out.printf("%d", result);
//    }
//}

class Task2 {
    private static List<Integer> list = new ArrayList<Integer>();
    private static List<Integer> newList = new ArrayList<Integer>();

    private static int sortMaxNumber (List<Integer> list){
        int result = sortMinNumber(list);
        for(int i = 0; i < list.size(); i++) {
            if(result < list.get(i)) {
                result = list.get(i);
            }
        }
        return result;
    }
    private static int sortMinNumber (List<Integer> list) {
        int result = 0;
        for(int i = 0; i < list.size(); i++) {
            if(result > list.get(i)) {
                result = list.get(i);
            }
        }
        return result;
    }
    private static void clearListMax() {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == sortMaxNumber(list)) {
                newList.add(list.get(i));
                list.remove(i);
            }
        }
    }

    public static void subTask(Random random, Scanner sc) {
        int length;
        System.out.print("length array task 2 = ");
        length = sc.nextInt();
        System.out.print("\n");
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = -3 + random.nextInt(25 - (-3));
        }

        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.print("\n");

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            clearListMax();
        }
        System.out.println("\nResult for second task = ");
        System.out.println(newList);
    }
}

class Task4 {
//    public static void subTasks(Scanner sc) {
//        int length;
//        System.out.print("length array = ");
//        length = sc.nextInt();
//        System.out.print("\n");
//
//        int[][] myArr = new int[length][length];
//
//        length -= 1;
//
//        int middle;
//        int num;
//        int num2;
//
//        if(length % 2 == 1) {
//            middle = (length + 1) / 2;
//        } else {
//            length += 1;
//            middle = (length + 1) / 2;
//        }
//
//        if (length == 5) {
//            num = 3;
//            num2 = 3;
//        } else {
//            num = length;
//            num2 = length;
//        }
//
//        for(int i = 0; i < length; i++) {
//            for(int j = 0; j < length; j++) {
//                if(j == middle - 1) {
//                    myArr[i][j] = num;
//                    if(i <= middle - 1 && num != 1) {
//                        num -= 1;
//                    } else {
//                        num += 1;
//                    }
//
//                }
//                if (i == middle - 1) {
//                    myArr[i][j] = num2;
//                    if(j <= middle - 1 && num2 != 1) {
//                        num2 -= 1;
//                    } else {
//                        num2 += 1;
//                    }
//                }
//                System.out.print(myArr[i][j]);
//            }
//            System.out.print("\n");
//        }
//    }

    public static void subTasks(Scanner sc) {
        List<Integer> number = new ArrayList<Integer>();
        int length;
        System.out.print("length array name task 4 = ");
        length = sc.nextInt();
        System.out.print("\n");
        for(int i = 1; i <= length; i++) {
            number.add(i);
        }
        System.out.println(number);
        System.out.println(number.size());


        int[][] myArr = new int[number.size()][number.size()];
        int nDown = 1;
        int nRight = 1;
        int nLeft = 1;
        if(number.size() % 2 != 0) {
            for(int i = 0; i < number.size(); i++) {
                for(int j = 0; j < number.size(); j++) {
                    if((number.size() / 2) == i && (number.size() / 2) == j) {
                        System.out.print(number.get(0));
                    }   else if((number.size() / 2) == i && (number.size() / 2) < j) {
                        System.out.print(number.get(nRight));
                        nRight += 1;
                    } else if((number.size() / 2) < i && (number.size() / 2) == j) {
                        System.out.print(number.get(nDown));
                        nDown += 1;
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.print("\n");
            }
            for(int i = 0; i < number.size(); i++) {
                for(int j = 0; j < number.size(); j++) {
                    if((number.size() / 2) == i && (number.size() / 2) < j) {
                        System.out.print(number.get(nLeft));
                        nLeft -= 1;
                    }
                }
                System.out.print("\n");
            }
        }
    }
}

class Task3 {
    public static void subTasks(Scanner sc) {
        List<String> name = new ArrayList<>();
//        List<Integer> number = new ArrayList<Integer>();

        int length;
        System.out.print("length array name task 3 = ");
        length = sc.nextInt();
        System.out.print("\n");

        for(int i = 0; i < length; i++) {
            System.out.print("Name [");
            System.out.print(i);
            System.out.print("] = ");
            ;
            name.add(sc.next());
            System.out.print("\n");
        }

        int length2;
        System.out.print("length array count task 3 = ");
        length2 = sc.nextInt();
        System.out.print("\n");

        int[][] arrNum = new int[name.size()][length2];
        // input data
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
            for (int j = 0; j < length2; j++) {
                arrNum[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }

        // show data
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
            System.out.print(" = ");
            for(int j = 0; j < length2; j++) {
                System.out.print(", ");
                System.out.print(arrNum[i][j]);
            }
            System.out.print("\n");
        }

        // show last us
        int[] countName = new int[name.size()];
        int[][] countSumm = new int[name.size()][length2];
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
            System.out.print(" = ");
            int summ = 0;
            for(int j = 0; j < length2; j++) {
//                System.out.print(", ");
//                System.out.print(arrNum[i][j]);
                summ += arrNum[i][j];
            }
            System.out.print(summ);
            countSumm[i][i] = summ;
            System.out.print("\n");
        }

        int con = 5;
        int[][] countSummNew = new int[con * 2][con * 2];
        countSummNew[con][con] = 0;
        // max summ
        for (int i = 0; i < name.size(); i++) {
            System.out.print("\n");

            if (countSummNew[con][con] < countSumm[i][i]) {
                countSummNew[con][con] = countSumm[i][i];
            }

        }
        System.out.print("max");
        System.out.print(countSummNew[con][con]);

        for (int i = 0; i < name.size(); i++) {
            System.out.print("\n");
            if (countSummNew[i][con] > countSumm[i][i]) {
                countSummNew[i][con] = countSumm[i][i];
                countSummNew[i][0] = countSummNew[i][con];
            }
        }
        System.out.print("min");
        System.out.print(countSummNew[0][0]);

        for (int i = 0; i < name.size(); i++) {
            System.out.print("\n");
            if (countSummNew[i][con] > countSumm[i][i] && countSummNew[con][con] != countSummNew[0][0]) {
                countSummNew[i][con] = countSumm[i][i];
                countSummNew[i][1] = countSummNew[i][con];
            }
        }

        for (int i = 0; i < name.size(); i++) {
            System.out.print("\n");
            if (countSummNew[i][con] > countSumm[i][i] && countSummNew[con][con] != countSummNew[2][2]) {
                countSummNew[con][con] = countSumm[i][i];
                countSummNew[i][2] = countSummNew[i][con];
            }
        }
    }
}