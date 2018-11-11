package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task1.subTask1();
        Task1.subTask2();
        Task2.subTask();
    }
}

class Task1 {
    private  static int from = -27;
    private  static int to = 9;

    private static int[] array() {
        int[] myList = new int[37];
        int item = 0;

        for(int i = from; i <= to; i++) {
            myList[item] = i;
            item += 1;
        }

        return myList;
    }


    public static void subTask1() {
        int result = 0;
        for(int i = 0; i < array().length; i++) {
            if(array()[i] > 0) {
                result += array()[i];
            }
        }
        System.out.print("\n");
        System.out.print("result sum positive = ");
        System.out.printf("%d", result);
    }

    public static void subTask2() {
        int result = 0;
        result = array()[1] - array()[2];
        System.out.print("\n");
        System.out.print("result composition = ");
        System.out.printf("%d", result);
    }
}

class Task2 {
    private static int[] arr = {2,7,5,-5,8,-2,0,-10};
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

    public static void subTask() { ;
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