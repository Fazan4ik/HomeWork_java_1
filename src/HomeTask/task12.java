package HomeTask;
import java.util.Arrays;
import java.util.Scanner;


public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {5, 3, 8, 6, 2, 7, 4, 1};
        System.out.println("Початковий масив: " + Arrays.toString(array));

        System.out.print("Оберіть спосіб сортування (1 - за зростанням, 2 - за спаданням): ");
        int choice = scanner.nextInt();

        sortArray(array, choice);

        System.out.print("Відсортований масив: " + Arrays.toString(array) );
    }

    public static void sortArray(int[] array, int choice) {
        if (choice == 1) {
            Arrays.sort(array);
        } else if (choice == 2) {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        } else {
            System.out.println("Помилка: невірний вибір.");
        }
    }
}
