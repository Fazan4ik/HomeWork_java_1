package HomeTask;
import java.util.ArrayList;
import java.util.Random;

public class task10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();

        System.out.println("Масив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i] + " ");

            if (array[i] % 2 == 0) {
                evenNumbers.add(array[i]);
            } else {
                oddNumbers.add(array[i]);
            }

            if (array[i] > 0) {
                positiveNumbers.add(array[i]);
            } else if (array[i] < 0) {
                negativeNumbers.add(array[i]);
            }
        }

        System.out.println("\nПарні числа: " + evenNumbers);
        System.out.println("Непарні числа: " + oddNumbers);
        System.out.println("Позитивні числа: " + positiveNumbers);
        System.out.println("Негативні числа: " + negativeNumbers);
    }
}
