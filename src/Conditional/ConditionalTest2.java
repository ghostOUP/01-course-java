package Conditional;

public class ConditionalTest2 {
    public static void main(String[] args) {

        int idade = 18;
        int numeroDeAcompanhantes = 1;
        boolean acompanhado = numeroDeAcompanhantes >= 2;

        if (idade >= 18 && acompanhado) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
