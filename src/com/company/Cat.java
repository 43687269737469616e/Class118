package com.company;

/**
 * Created by Christian Paredes on 11/8/2016.
 */
public class Cat extends Animal{
    private String name;
    private int lives;

    public Cat(double height, double weight, String name, int lives) {
        super(height, weight);
        this.name = name;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public String toString() {
        return super.toString() + " Cat{" +
                "name='" + name + '\'' +
                ", lives='" + lives + '\'' +
                '}';
    }
}
