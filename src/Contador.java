/* Desafio: Contador - DIO 04-2025 
Lógica desenvolvida por ChatGPT e revisado por Takdoi
Objetivo do código: 
    ao Executar a saída deverá ser:
`Digite o primeiro número: 5
Digite o segundo número: 10
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
`
    senão:
`Digite o primeiro número: 12
Digite o segundo número: 10
O segundo parâmetro deve ser maior que o primeiro
`
*/

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner terminal = new Scanner(System.in)) {
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
