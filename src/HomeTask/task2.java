package HomeTask;
import java.util.Scanner;


public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число:");
        double value = scanner.nextDouble();

        System.out.println("Введіть відсоток:");
        double percentage = scanner.nextDouble();

        double result = (value * percentage) / 100;
        System.out.println(percentage + "% від " + value + " = " + result);
    }
}
