package HomeTask;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть початкове число: ");
        int start = scanner.nextInt();

        System.out.print("Введіть кінцеве число: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }
}
