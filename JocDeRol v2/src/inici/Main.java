package inici;

import joc.*;
public class Main {
    public static void Part2() {
        Warriors huma1 = new Warriors("Raül", 16, 5, 900);
        Alien alien1 = new Alien("ET", 6, 2, 30);
        Human alien2 = new Human("ruben", 60, 20, 300);
        alien2.attack(huma1);
    }

    public static void main(String[] args) {
        Part2();
    }


}