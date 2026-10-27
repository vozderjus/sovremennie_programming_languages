import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число (n > 1): ");
        int n = scanner.nextInt();

        long current = 1;
        long previous = 1;

        while (current < n) {
            long next = current + previous;
            previous = current;
            current = next;
        }

        boolean Fibonnachi = n == current;

        System.out.println("Ответ: " + Fibonnachi);
    }
}
