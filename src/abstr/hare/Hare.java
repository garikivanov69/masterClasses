package abstr.hare;

import abstr.WildAnimal;

public abstract class Hare extends WildAnimal {
    public Hare(int height, int weight) {
        super(height, weight);
    }


    @Override
    public String toString() {
        return "Hare{weight=" + getWeight() + "; height="+ getHeight() + "}";
    }
}
