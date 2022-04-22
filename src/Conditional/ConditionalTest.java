package Conditional;

public class ConditionalTest {
    public static void main(String[] args) {

        int idade = 17;
        int numeroAcompanhantes = 1;

        if (idade >= 18) {
            System.out.println("Você pode ficar tranquilo, tem mais de 18 anos!");
        } else {
            if (numeroAcompanhantes >= 2) {
                System.out.println("Voce nao tem 18 anos, porem esta acompanhado! Pode passar!");
            } else {
                System.out.println("Acesso negado!");
            }
        }

    }
}
