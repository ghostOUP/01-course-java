package Conditional;

public class TestScope {
    public static void main(String[] args) {

        int idade = 18;
        int numeroDeAcompanhantes = 2;
        boolean acompanhado;

        if (numeroDeAcompanhantes >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("Valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
