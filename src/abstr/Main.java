package abstr;

import abstr.hare.HareGray;
import abstr.hare.HareWhite;
import abstr.others.Car;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest(3);
        Bear bear = new Bear(100, 100);
        Fox fox = new Fox(5, 5);
        Wolf wolf = new Wolf(10, 10);
        forest.getWildAnimals()[0] = new HareGray(2, 2);
        forest.getWildAnimals()[1] = new HareWhite(1, 1);


        forest.perfomance();
    }
}
