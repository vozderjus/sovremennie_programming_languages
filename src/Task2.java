import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите A: ");
        double a = scanner.nextDouble();

        System.out.print("Введите n (n > 0): ");
        double n = scanner.nextInt();

        double temporary = a;
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            total += temporary;
            temporary *= -a;
        }

        System.out.println("Ответ: " + total);
    }
}
