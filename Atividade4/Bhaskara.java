import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);
        System.out.println("Delta: " + delta);

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            double raizDelta = Math.sqrt(delta);
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);

            System.out.println("As raízes são:");
            System.out.println("x' = " + x1);
            System.out.println("x'' = " + x2);
        }

        scanner.close();
    }
}
