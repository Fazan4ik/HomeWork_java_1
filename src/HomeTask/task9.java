package HomeTask;
import java.util.Random;

public class task9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Масив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i] + " ");

            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
            if (array[i] > 0) positiveCount++;
            if (array[i] < 0) negativeCount++;
            if (array[i] == 0) zeroCount++;
        }

        System.out.println("\nМінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Кількість позитивних: " + positiveCount);
        System.out.println("Кількість негативних: " + negativeCount);
        System.out.println("Кількість нулів: " + zeroCount);
    }
}
