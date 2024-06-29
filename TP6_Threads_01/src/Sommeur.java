public class Sommeur implements Runnable{
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public Sommeur(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSomme() {
        return sum;
    }
}
