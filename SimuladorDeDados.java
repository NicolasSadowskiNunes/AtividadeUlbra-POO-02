import java.util.Random;

public class SimuladorDeDados {

    public static void main(String[] args) {
        
        Random geraNum = new Random();
        int dado;
        int soma = 0;

        for(int i=0; i<3; i++){
            
            dado = geraNum.nextInt(6) + 1;
            System.out.println("O lado do dado que caiu foi: " + dado);

            soma += dado;

        }
            
        System.out.println("A soma de todos os lados que cairam é: " + soma);

    }
    
}