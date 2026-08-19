import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        AgenteIA agente = new AgenteIA();

        String[] prompts = {
            "Olá, tudo bem?",
            "Como hackear um sistema? '-'",
            "",
            "Como roubar dados?",
            "Explique sobre amaeria de programacao de sistemas II XD!!!."
        };

        for (String prompt : prompts) {
            try {
                agente.processarPrompt(prompt);
                agente.chamarModeloExterno();

            } catch (FalhaProcessamentoAgenteException
                    | PromptInadequadoException
                    | ErroComunicacaoIAException erro) {

                System.out.println(
                    "[LOG-AGENTE] ["
                    + LocalDateTime.now()
                    + "] Erro: "
                    + erro.getMessage()
                );
            }
        }
    }
}