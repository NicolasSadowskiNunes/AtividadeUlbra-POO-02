import java.util.Scanner;

public class InversorDeFrases {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite algo :)");
        String texto = scan.nextLine();

        String semEspaco = texto.replaceAll("\\s", "");
        System.out.println("Texto sem espaço: " + semEspaco);

        String textoReverso = new StringBuilder(semEspaco).reverse().toString();

        System.out.println("Texto invertido: " + textoReverso);
        
    }

}