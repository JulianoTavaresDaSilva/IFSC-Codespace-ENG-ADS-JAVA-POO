import java.util.Scanner;

public class HoraMinuto {
   
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em horas: ");
        double horas = entrada.nextDouble();

        double minutos = horas * 60;

        System.out.printf("Valor em minutos %.2f", minutos);

    }
}
