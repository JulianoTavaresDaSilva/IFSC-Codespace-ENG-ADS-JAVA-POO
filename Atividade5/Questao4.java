import java.util.Scanner; // arrumei o import, retirando o java da frente dele e colocando o S maiúsculo no Scanner.

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt(); //troquei o .nextDouble para .nextInt, pois uma variável int só pode receber números inteiros.
        
        System.out.println("Número digitado: " + numero);
    }
}
