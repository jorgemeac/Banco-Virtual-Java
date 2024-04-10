import java.util.Scanner;

public class BancoVirtual {
    public static void main(String[] args) {
        String nomeCliente = "Fulano de Tal";
        String tipoConta = "Conta Corrente";
        double saldoConta = 10000.00;
        int opcao = 0;

        System.out.println("****************************************\n");
        System.out.println("Nome:             " + nomeCliente);
        System.out.println("Conta:            " + tipoConta);
        System.out.println("Saldo Atual:      " + saldoConta);
        System.out.println("\n****************************************\n");

        //Menu de opções
    String perfilCliente = """
           Prezado(a) cliente, seja bem-vindo(a) ao:
           ** Menu de Opções **
           1 - Consultar Saldos
           2 - Transferência ou Saque
           3 - Deposito
           4 - Sair
           \s""";

        Scanner leituraValorDigitado = new Scanner(System.in);
        
        while (opcao != 4) {
            System.out.println(perfilCliente);
            opcao = leituraValorDigitado.nextInt();
            
            if (opcao == 1) {
                System.out.println("\nSeu saldo atual é: R$" + saldoConta + ".\n");
            } else if (opcao == 2) {
                System.out.println("\nQual o valor de transferência?\n");
                double valorTransferido = leituraValorDigitado.nextDouble();
                if (valorTransferido > saldoConta) {
                    System.out.println("\nSaldo insuficiente. Voce só possui R$ " + saldoConta +
                            "\ne tentou transferir R$ " + valorTransferido + ". Escolha a " +
                            "\nOpção 2 novamente e insira um valor menor\n" +
                    "ou se preferir, faça um Depósito.\n");

                } else {
                    saldoConta -= valorTransferido;
                    System.out.println("\nTransferencia de R$ " + valorTransferido + " realizado com" +
                            "\n sucesso! Seu novo saldo é R$ " + saldoConta + ".\n");
                }
            } else if (opcao == 3) {
                System.out.println("\nQual o valor do depósito?\n");
                double valorDepositado = leituraValorDigitado.nextDouble();
                saldoConta += valorDepositado;
                System.out.println("\nDepósito de R$ " + valorDepositado + " realizado com" +
                        "\n sucesso! Seu novo saldo é R$ " + saldoConta + ".\n");
            } else if (opcao != 4) {
                System.out.println("\nOpção inválida!\n");
            }

        }
        System.out.println("\nAgradecemos sua preferencia. Volte Sempre!\n");
    }
}
