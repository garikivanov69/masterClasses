package abstr;

public class Bear extends WildAnimal {

    public Bear(int height, int weight) {
        super(height, weight);
    }

    @Override
    public void voice() {
        System.out.println("Beeeeeeee");
    }

    @Override
    public String toString() {
        return "Bear{weight=" + getWeight() + "; height="+ getHeight() + "}";
    }
}
