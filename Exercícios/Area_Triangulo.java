import java.util.Scanner;

public class Area_Triangulo {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
     
       System.out.print("Valor da base: ");
       double b = entrada.nextDouble();
     
       System.out.print("Valor da altura: ");
       double h = entrada.nextDouble();
     
       double area = (b * h) / 2;

       System.out.printf("A área do triângulo é: %.2f\n", area);
     
       entrada.close();
    }
}