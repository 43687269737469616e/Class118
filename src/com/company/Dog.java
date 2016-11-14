package com.company;

/**
 * Created by Christian Paredes on 11/8/2016.
 */
public class Dog extends Animal{
    private String name;
    private String breed;
    private String DOB;

    public Dog(double height, double weight, String name, String breed, String DOB) {
        super(height, weight);
        this.name = name;
        this.breed = breed;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return super.toString() + " Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }
}
