import java.util.Scanner;

public class Bhaskara {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Valor de b: ");
        double b = entrada.nextDouble();

        System.out.print("Valor de c: ");
        double c = entrada.nextDouble();

        double delta = b**2 - 4 * a * c;
        
    }
}
