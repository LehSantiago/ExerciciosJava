public class PromptInadequadoException extends Exception {
    String mensagem;

    public PromptInadequadoException(String mensagem) {
        super(mensagem);
    }
}