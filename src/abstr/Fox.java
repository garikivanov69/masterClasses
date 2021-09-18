package abstr;

public class Fox extends WildAnimal {

    public Fox(int height, int weight) {
        super(height, weight);
    }

    @Override
    public void voice() {
        System.out.println("Wouuuf");
    }

    @Override
    public String toString() {
        return "Fox{weight=" + getWeight() + "; height="+ getHeight() + "}";

    }
}
