import java.util.Scanner;

public class ManipulacaoDeSubstrings {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String texto = "";

        System.out.println("Digite algo :) ");
        texto = scan.nextLine();        

        String textoMenosUm = texto.substring(0, texto.length() - 1);

        System.out.println("O texto menos um caractere: " + textoMenosUm);

    }

}