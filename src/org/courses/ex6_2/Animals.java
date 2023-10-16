package org.courses.ex6_2;

public enum Animals {

    DOG(11),
    CAT(13),
    TURTLE(75),
    TIGER(28),
    ELEFANT(55);

    private int age;

    Animals(int age){
        this.age = age;
    }
    public String toString() {
        return this.name() + "\t" +this.age;
    }
}
