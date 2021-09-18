package abstr;

import java.util.Objects;

public abstract class WildAnimal {
    private int height;
    private int weight;

    public WildAnimal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void voice();

    @Override
    public abstract String toString();
}
