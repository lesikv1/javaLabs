package com.company;

public abstract class forTrain {
    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public int getRailwayCarriage() {
        return railwayCarriage;
    }

    public void setRailwayCarriage(int railwayCarriage) {
        this.railwayCarriage = railwayCarriage;
    }

    private String nameTrain;
    private int massa;
    private int path;
    private int railwayCarriage;
    private int trainID;
    static int trainCounter = 0;

    forTrain() {
        this.trainID = this.trainCounter;
        this.trainCounter++;

        this.nameTrain = "first train";
        this.massa = 40;
        this.railwayCarriage = 1;
        this.path = 500;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public String getNameTrain() {
        return nameTrain;
    }

    public void setNameTrain(String nameTrain) {
        this.nameTrain = nameTrain;
    }
}
