import java.util.Scanner;

public class MinutoHora {
   
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em minutos: ");
        double minutos = entrada.nextDouble();

        double horas = minutos / 60;

        System.out.printf("Valor em horas %.2f", horas);

    }
}