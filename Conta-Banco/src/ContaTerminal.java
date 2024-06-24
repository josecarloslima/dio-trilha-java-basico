import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura de dados do usuário
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite o numero da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Digite so numero da conta: ");
        Integer numeroConta = scanner.nextInt();

        // Cração do objeto ContaBancaria
        ContaBancaria conta = new ContaBancaria(nome, sobrenome, numeroAgencia, saldo, numeroConta);

        // Exibição das informações da conta
        conta.exibirInformacoes();

        // Fechamento do scanner
        scanner.close();
    } 
}
