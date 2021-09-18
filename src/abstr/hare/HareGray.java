package abstr.hare;

public class HareGray extends Hare{
    public HareGray(int height, int weight) {
        super(height, weight);
    }

    @Override
    public void voice() {
        System.out.println("Trrrrr");
    }
}
