import java.util.Scanner;

public class Media {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        double n1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota:");
        double n2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota:");
        double n3 = entrada.nextDouble();

        System.out.print("Digite a quarta nota:");
        double n4 = entrada.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Sua média é " + media);
    }
}
