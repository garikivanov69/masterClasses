package abstr;

import java.util.Arrays;

public class Forest {
    private WildAnimal[] wildAnimals;

    public Forest(int countOfAnimals) {
        this.wildAnimals = new WildAnimal[Math.abs(countOfAnimals)];
    }

    public WildAnimal[] getWildAnimals() {
        return wildAnimals;
    }

    public void setWildAnimals(WildAnimal[] wildAnimals) {
        this.wildAnimals = wildAnimals;
    }


    public void perfomance() {
        for (int i = 0; i < wildAnimals.length; i++) {
            wildAnimals[i].voice();
        }
    }

    @Override
    public String toString() {
        return "Forest{" +
                "wildAnimals=" + Arrays.toString(wildAnimals) +
                '}';
    }
}
