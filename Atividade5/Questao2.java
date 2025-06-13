import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner name = new Scanner (System.in);

        System.out.println("Qual seu nome? ");
        String entrada = name.nextLine();

        System.out.println("Qual sua idade? ");
        int idade = name.nextInt();

        System.out.println("Qual sua altura? ");
        double altura = name.nextDouble();

        System.out.println("Seu nome: " + entrada);
        System.out.println("Sua idade: " + idade);
        System.out.println("Sua altura: " + altura);

        name.close();

    }
}
