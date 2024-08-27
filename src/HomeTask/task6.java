package HomeTask;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість метрів:");
        double meters = scanner.nextDouble();

        System.out.println("Оберіть одиницю виміру (1 - милі, 2 - дюйми, 3 - ярди):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(meters + " метрів = " + meters * 0.000621371192 + " миль");
                break;
            case 2:
                System.out.println(meters + " метрів = " + meters * 39.3700787 + " дюймів");
                break;
            case 3:
                System.out.println(meters + " метрів = " + meters * 1.0936133 + " ярдів");
                break;
            default:
                System.out.println("Помилка: невірний вибір.");
        }
    }
}
