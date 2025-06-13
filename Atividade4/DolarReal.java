import java.util.Scanner;

public class DolarReal {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor em dolar: ");
        double dolar = entrada.nextDouble();

        double real = dolar * 5.64;

        System.out.println("Valor em real: " + real);
    }
}
