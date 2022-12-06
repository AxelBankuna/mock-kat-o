package com.kata;

public class Main {
    public static void main(String[] args) {
        Copier copier = new Copier("Once you have a single \ncharacter working add");

        System.out.println("Before Copy...");
        System.out.println("destination: " + copier.destination);

        copier.copy();

        System.out.println("After Copy...");
        System.out.println("destination: " + copier.destination);
    }
}
