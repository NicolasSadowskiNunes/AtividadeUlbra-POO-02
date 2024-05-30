import java.util.Scanner;

public class AjusteDePreçoFarmacia {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int i = 1;
        double valor;

        while (i != 0) {
            
            valor = scan.nextDouble();

            if(valor != 0){

                double resultado = valor + (valor * 0.12);
                
                System.out.println("O produto que antes era: R$" + valor);
                System.out.println("Agora custa: R$" + Math.round(resultado));    
                    
            }
            else{
                i--;
                System.out.println("Favor inserir um valor maior que zero!");
            }

        }

    }

}