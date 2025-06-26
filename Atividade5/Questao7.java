import java.util.Scanner; // arrumei o import, retirando o java da frente dele.

public class Questao7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); // consome a quebra de linha deixada pelo nextInt()

        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        
        System.out.println("Nome: " + nome + ", Idade: " + idade);
        entrada.close();
    }
}

