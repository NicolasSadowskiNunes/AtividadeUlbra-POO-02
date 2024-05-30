import java.util.Scanner;

public class CalculadoraDePotencia {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scan.nextDouble();

        System.out.println("Digite uma potência");
        double pot = scan.nextDouble();

        System.out.println("O número " + num + " elevado a potência de " + pot + " é: " + Math.pow(num, pot));

    }

}