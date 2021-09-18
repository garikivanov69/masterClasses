package abstr.hare;

public class HareWhite extends Hare{
    public HareWhite(int height, int weight) {
        super(height, weight);
    }

    @Override
    public void voice() {
        System.out.println("Tr");
    }
}
