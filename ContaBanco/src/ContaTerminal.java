import java.util.Locale; // Importa a classe Locale para configurar o formato de número decimal
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário do terminal
        // Configura o Locale para US para garantir que o ponto seja usado como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem-vindo ao sistema de criação de conta bancária!");

        // Solicita e lê o número da agência
        System.out.print("Por favor, digite o número da Agência (ex: 1021): ");
        numero = scanner.nextInt(); // Lê um inteiro

        // Consome a linha pendente após nextInt() para evitar problemas com nextLine()
        scanner.nextLine();

        // Solicita e lê a agência
        System.out.print("Por favor, digite o código da Agência (ex: 067-8): ");
        agencia = scanner.nextLine(); // Lê uma linha de texto

        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o seu Nome Completo (ex: MARIO ANDRADE): ");
        nomeCliente = scanner.nextLine(); // Lê uma linha de texto

        // Solicita e lê o saldo
        System.out.print("Por favor, digite o valor do depósito inicial (ex: 237.48): ");
        saldo = scanner.nextDouble(); // Lê um número decimal

        // Fecha o scanner para liberar recursos
        scanner.close();

        // Exibe a mensagem final com os dados da conta

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}