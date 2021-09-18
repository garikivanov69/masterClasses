package abstr;

public class Wolf extends WildAnimal {

    public Wolf(int height, int weight) {
        super(height, weight);
    }

    @Override
    public void voice() {
        System.out.println("Auuuuf");
    }

    @Override
    public String toString() {
        return "Wolf{weight=" + getWeight() + "; height="+ getHeight() + "}";
    }
}
