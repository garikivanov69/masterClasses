package inheritance;

import java.util.Arrays;

public class Host {
    private Animal[] animals = new Animal[3];

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Host{" +
                "animals=" + Arrays.toString(animals) +
                '}';
    }
}
