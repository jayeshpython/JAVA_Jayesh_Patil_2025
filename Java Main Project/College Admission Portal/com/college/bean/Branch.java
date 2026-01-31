
package com.college.bean;

public class Branch {
    private final double lastYearCutOff;
    private double thisYearCutOff;
    private int availableSeats;

    public Branch(double lastYearCutOff, double thisYearCutOff, int availableSeats){
        this.lastYearCutOff = lastYearCutOff;
        this.thisYearCutOff = thisYearCutOff;
        this.availableSeats = availableSeats;
    }

    public double getLastYearCutOff() {
        return lastYearCutOff;
    }

    public double getThisYearCutOff() {
        return thisYearCutOff;
    }

    public void setThisYearCutOff(double thisYearCutOff) {
        this.thisYearCutOff = thisYearCutOff;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
    return "Branch [lastYearCutOff=" + lastYearCutOff +
           ", thisYearCutOff=" + thisYearCutOff +
           ", availableSeats=" + availableSeats + "]";
    }

}
