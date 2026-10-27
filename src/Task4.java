import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 4 числа (x1, y1, x2, y2): ");
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();

        double sum = 0;
        sum += Math.abs(x2 - x1) * 2;
        sum += Math.abs(y2 - y1) * 2;

        System.out.println("Периметр прямоугольника: " + sum);
    }
}
