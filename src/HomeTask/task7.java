package HomeTask;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int first = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int second = scanner.nextInt();

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        System.out.println("Непарні числа в діапазоні від " + first + " до " + second + ":");
        for (int i = first; i <= second; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }
}
