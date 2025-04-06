# Desafio Controle de Fluxo - DIO

Este repositório contém a solução para o desafio de controle de fluxo proposto pela [Digital Innovation One (DIO)](https://www.dio.me/), com o objetivo de exercitar o uso de estruturas de controle de fluxo, como o `for` e o tratamento de exceções em Java.

## Descrição

O sistema recebe dois números inteiros como parâmetros e realiza a contagem entre eles, imprimindo uma mensagem a cada número incrementado. Se o primeiro número for maior que o segundo, o sistema lança uma exceção customizada chamada `ParametrosInvalidosException`.

## Funcionalidades

- O sistema recebe dois números inteiros do terminal.
- Se o primeiro número for maior que o segundo, lança uma exceção personalizada (`ParametrosInvalidosException`).
- Caso os parâmetros sejam válidos, o sistema imprime as contagens entre os dois números, conforme a quantidade de interações (`for`).

## Tecnologias Utilizadas

- Java 8+ (Linguagem)
- Exceções customizadas

## Como rodar o projeto

1. Clone o repositório:
    ```bash
    git clone https://github.com/Takdoi/desafio-controle-fluxo.git
    ```

2. Compile o código:
    ```bash
    javac Contador.java
    ```

3. Execute o código:
    ```bash
    java Contador
    ```

4. Siga as instruções no terminal para inserir os dois números inteiros.

## Créditos

Este desafio foi criado pela [Digital Innovation One](https://www.dio.me/) como parte do conteúdo de controle de fluxo em Java.

## License

Este projeto é licenciado sob a licença MIT - consulte o arquivo [LICENSE.md](LICENSE.md) para mais detalhes.
