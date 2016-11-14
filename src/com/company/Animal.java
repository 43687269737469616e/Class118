package com.company;

/**
 * Created by Christian Paredes on 11/8/2016.
 */
public class Animal {
    private double height;
    private double weight;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Animal{" +
                "height=" + height + " feet" +
                ", weight=" + weight + " lbs" +
                '}';
    }
}
