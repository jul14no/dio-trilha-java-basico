import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        // Solicita e lê a agência
        System.out.print("Digite a agência: ");
        String agencia = scanner.next();

        // Solicita e lê o nome do cliente
        System.out.print("Digite o nome do cliente: ");
        scanner.nextLine(); 
        
        // Consumir a nova linha deixada pelo next()
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibe os dados da conta
        System.out.println("\nDados da Conta:");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);

        scanner.close();
    }
}

 ContaTerminal.java
 ContaTerminal
