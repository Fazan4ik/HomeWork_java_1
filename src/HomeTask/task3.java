package HomeTask;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть першу цифру: ");
        int firstDigit = scanner.nextInt();

        System.out.print("Введіть другу цифру: ");
        int secondDigit = scanner.nextInt();

        System.out.print("Введіть третю цифру: ");
        int thirdDigit = scanner.nextInt();

        int number = firstDigit * 100 + secondDigit * 10 + thirdDigit;
        System.out.println("Отримане число: " + number);
    }
}
