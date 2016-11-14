package com.company;

/**
 * Created by Christian Paredes on 11/8/2016.
 */
public class Bird extends Animal{
    private double wingSpan;
    private boolean canFly;

    public Bird(double height, double weight, double wingSpan, boolean canFly) {
        super(height, weight);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return super.toString() + " Bird{" +
                "wingSpan=" + wingSpan + " feet" +
                ", canFly=" + canFly +
                '}';
    }
}
