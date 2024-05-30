import java.util.Scanner;

public class DetectorDeConteudoImproprio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] palavrasBanidas = { "sexo", "sexual" };
        boolean encontrou = false;

        System.out.println("Insira uma palavra permitida: ");
        String palavra = scan.nextLine();

        for (int i = 0; i < palavrasBanidas.length; i++) {

            if (palavra.equals(palavrasBanidas[i])) {
                encontrou = true;
                break;
            }

        }

        if(encontrou){
            System.err.println("Palavra imprópria!");
        }
        else{
            System.out.println("Conteúdo liberado!");
        }

    }

}