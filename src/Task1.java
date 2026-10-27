import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();

        if (limit < 2) {
            System.out.println("N должно быть не меньше 2");
        }

        double sum = 0.0;
        for (int n = 2; n <= limit; n++) {
            double term = 1.0 / Math.log(n);
            sum += term;

        }

        System.out.println("Ответ: " + sum);
    }
}