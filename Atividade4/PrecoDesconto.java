import java.util.Scanner;

public class PrecoDesconto {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço base: ");
        double precoBase = entrada.nextDouble();

        System.out.print("Porcentagem de desconto: ");
        double porcentagem = entrada.nextDouble();

        double desconto = (precoBase * porcentagem) / 100;

        double precoFinal = precoBase - desconto;

        System.out.println("O preço final fica R$" + precoFinal);
    }
}
