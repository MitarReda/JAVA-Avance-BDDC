import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Talkative(i));
            thread.start();
        }
    }
    /*public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array
        int numberOfThreads = 2; // Example number of threads
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        int length = array.length;
        int chunkSize = length / numberOfThreads;
        Sommeur[] sommeurs = new Sommeur[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numberOfThreads - 1) ? length : start + chunkSize;
            sommeurs[i] = new Sommeur(array, start, end);
            executor.submit(sommeurs[i]);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = 0;
        for (Sommeur sommeur : sommeurs) {
            totalSum += sommeur.getSomme();
        }

        System.out.println("Total sum: " + totalSum);
    }*/
}