import java.util.Scanner;

public class AnosDias {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor de anos: ");
        double anos = entrada.nextDouble();

        double dias = anos * 365;

        System.out.println("Quantidade de dias: " + dias);
    }
}
