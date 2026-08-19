public class ErroComunicacaoIAException extends Exception {
    String mensagem;
    public ErroComunicacaoIAException(String mensagem){
        super(mensagem);
    }
}