import java.util.Scanner;

public class Atividade {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 100.0;
        
        System.out.println("=== CAIXA ELETRÔNICO ===");
        System.out.println("Saldo atual: R$" + saldo);
        System.out.print("Digite o valor que deseja sacar: R$");
        double valorSaque = scanner.nextDouble();

        try {
            //saque
            if (valorSaque > saldo) {
                throw new SaldoInsuficienteException(valorSaque, saldo);
            }
            saldo -= valorSaque;
            System.out.println("\n✓ Saque de R$" + valorSaque + " realizado com sucesso!");
            System.out.println("Novo saldo: R$" + saldo);
        } catch (SaldoInsuficienteException e) {
            System.out.println("\n✗ ERRO: " + e.getMessage());
            System.out.println("Saldo disponível: R$" + e.getSaldoAtual());
        }
        
        scanner.close();
    }

    public static class SaldoInsuficienteException extends Exception {
        private double saldoAtual;

        public SaldoInsuficienteException(double valorTentado, double saldoAtual) {
            super("Tentou sacar R$" + valorTentado);
            this.saldoAtual = saldoAtual;
        }

        public double getSaldoAtual() {
            return saldoAtual;
        }
    }
}