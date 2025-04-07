import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // Criando o Scanner para capturar os parâmetros passados no terminal
        Scanner terminal = new Scanner(System.in);

        // Recebendo os dois parâmetros inteiros do usuário
        System.out.print("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método para realizar a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Exibindo a mensagem de erro quando os parâmetros são inválidos
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verificando se o primeiro número é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calculando a quantidade de interações
        int contagem = parametroDois - parametroUm;

        // Realizando o for para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
