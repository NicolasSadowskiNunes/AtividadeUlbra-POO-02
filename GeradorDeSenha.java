public class GeradorDeSenha {
    
    public static void main(String[] args) {
        
        String senha = "";

        int numDeDigito = 5 + (int)(Math.random() * 6);

        System.out.println(numDeDigito);

        System.out.println(numDeDigito);
        
        for (int i = 0; i < numDeDigito; i++) {
            int digito = 5 + (int)(Math.random() * 6);
            senha += digito;
        }

        System.out.println("A senha gerada foi: " + senha);
    }

}