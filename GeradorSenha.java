package Conectar;

public class GeradorSenha {
    public static void main(String[] args) {
        int valorAleatorio = (int) (Math.random() * 6) + 5;
        String senha = "";

        for (int i = 0; i < valorAleatorio; i++) {
            int digito = (int) (Math.random() * 10);
            senha += digito;
        }

        System.out.println("Número sorteado: " + valorAleatorio);
       
        System.out.println("Senha: " + senha);
   
    }
}