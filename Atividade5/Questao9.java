import java.util.Scanner; // arrumei o import, retirando o java da frente dele e adicionando um ; no final.

public class Questao9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble(); // arrumei o nextInt para nextDouble
        
        final int CONVERSAO = 32; // mudei de lugar
        double fahrenheit = celsius * 9/5 + CONVERSAO;
        
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        
        int CONVERSAOKELVIN = 273; // Para converter para Kelvin // declarei como variavel e mudei o nome dela
        double kelvin = celsius + CONVERSAOKELVIN;
        
        System.out.println("Temperatura em Kelvin: " + kelvin);
    }
} 
    

