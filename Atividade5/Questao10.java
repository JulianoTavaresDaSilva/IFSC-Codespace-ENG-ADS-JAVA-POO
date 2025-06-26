import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = entrada.nextLine();
        System.out.print("Digite o código do produto: ");
        int codigo = entrada.nextInt();
        System.out.print("Digite o preço do produto: ");
        double valor = entrada.nextDouble();
        System.out.print("Digite a quantidade para o estoque: ");
        int quantidade = entrada.nextInt();
        System.out.print("O produto está ativo? (true/false): ");
        boolean ativo = entrada.nextBoolean();

        double valorEstoque = valor * quantidade;

        if (ativo == true){
            System.out.printf("Foram adicionadas ao estoque, %d quantidade(s) do produto '%s', com código igual à %d, e valor igual à R$%.2f.\n", quantidade, produto, codigo, valor);
            System.out.printf("Valor total do estoque igual à R$%.2f \n", valorEstoque);
        } else {
            System.out.println("O produto está inativo.");
        }
    }
}
