package HomeTask;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину лінії:");
        int length = scanner.nextInt();

        System.out.println("Оберіть напрямок (1 - горизонтально, 2 - вертикально):");
        int direction = scanner.nextInt();

        System.out.println("Введіть символ:");
        char symbol = scanner.next().charAt(0);

        drawLine(length, direction, symbol);
    }

    public static void drawLine(int length, int direction, char symbol) {
        if (direction == 1) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        } else if (direction == 2) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Помилка: невірний напрямок.");
        }
    }
}
