public class AgenteIA {

    public void processarPrompt(String prompt) 
            throws FalhaProcessamentoAgenteException, PromptInadequadoException {

        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException(
                "O prompt não pode estar vazio."
            );
        }

        if (prompt.length() > 100) {
            throw new FalhaProcessamentoAgenteException(
                "Prompt muito longo para o modelo atual."
            );
        }

        System.out.println("Agente processando: " + prompt);
        
         if (prompt.contains("hackear") || prompt.contains("roubar")){
            throw new PromptInadequadoException(
                "-----O prompt contém palavras inadequadas!-----"
            );
        }
        System.out.println("Mensagem aceita: " + prompt);
    }

    public void chamarModeloExterno()
        throws ErroComunicacaoIAException {

    double numeroAleatorio = Math.random();

    if (numeroAleatorio > 0.7) {
        throw new ErroComunicacaoIAException(
            "Falha na comunicação com o modelo externo."
            );
        }
    }
}  
       
        

   
       
        