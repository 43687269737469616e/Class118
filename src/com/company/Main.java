package com.company;

public class Main {

    public static void main(String[] args) {
        Animal someAnimal = new Animal(40,5000);
        Dog scruffy = new Dog (3, 100, "Scruffy", "Mutt", "10/13/2012");
        Cat fluffy = new Cat (1, 20, "Fluffy", 5);
        Bird tweety = new Bird (0.2, 1, .3, true);

	    System.out.println(someAnimal);
        System.out.println(scruffy);
        System.out.println(fluffy);
        fluffy.kittyHeaven(true);
        System.out.println(fluffy);
        System.out.println(tweety);

    }
}
