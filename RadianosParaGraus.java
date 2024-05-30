import java.util.Scanner;

public class RadianosParaGraus {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o radiano para ser convertido em graus: ");
        double raio = scan.nextDouble();

        double grau = Math.toDegrees(raio);

        System.out.println("O radiano " + raio + ", convertido para graus: " + grau + "°");

    }

}

