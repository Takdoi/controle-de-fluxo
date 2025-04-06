public class ParametrosInvalidosException extends Exception {

    // Adicionando um serialVersionUID para evitar problemas de serialização (caso deseje serializar a exceção)
    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem de erro e a passa para a classe pai (Exception)
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Passa a mensagem de erro para a classe Exception
    }
}
