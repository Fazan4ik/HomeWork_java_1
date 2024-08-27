package HomeTask;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть шестизначне число:");
        String number = scanner.nextLine();

        if (number.length() != 6) {
            System.out.println("Помилка: введено не шестизначне число.");
        } else {
            char[] digits = number.toCharArray();
            char temp1 = digits[0];
            char temp2 = digits[1];

            digits[0] = digits[5];
            digits[1] = digits[4];
            digits[5] = temp1;
            digits[4] = temp2;

            System.out.println("Змінене число: " + new String(digits));
        }
    }
}
