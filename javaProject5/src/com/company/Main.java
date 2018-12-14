package com.company;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void getAndSet() {
        LinkedList<String> nameTrain = new LinkedList<>();
        LinkedList<Integer> massaTrain = new LinkedList<Integer>();
        LinkedList<Integer> railwayCarriage = new LinkedList<Integer>();


        forTrain train = new Train();
        forTrain locom = new Locomotive();
        forTrain elTrain = new ElectricTrain();

        for(int i = 1; i < 20; i++) {
            train.setNameTrain("train 177" + i);
            train.setPath(700);
            train.setMassa(55 * i);
            train.setRailwayCarriage(i);

            nameTrain.add(train.getNameTrain());
            massaTrain.add(train.getMassa());
            railwayCarriage.add(train.getRailwayCarriage());
        }


        // find max and min massa
        int maxMass = 0;
        for(int i = 0; i < massaTrain.size(); i++) {
            if(maxMass <= massaTrain.get(i)) {
                maxMass = massaTrain.get(i);
            }
        }
        System.out.print("max massa train = ");
        System.out.print(maxMass);
        System.out.print("\n");
        int minMass = maxMass;
        for(int i = 0; i < massaTrain.size(); i++) {
            if(minMass >= massaTrain.get(i)) {
                minMass = massaTrain.get(i);
            }
        }
        System.out.print("min massa train = ");
        System.out.print(minMass);
        System.out.print("\n");

        // finc middle railway Carriage
        int summ = 0;
        int result;
        for(int i = 0; i < railwayCarriage.size(); i++) {
            summ += railwayCarriage.get(i);
        }
        result = summ / railwayCarriage.size();
        System.out.print("middle railwayCarriage = ");
        System.out.print(result);
        System.out.print("\n");
    }

    public static void main(String[] args) {
        getAndSet();
    }
}
