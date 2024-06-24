public class ContaBancaria {
    // Atributos
    String nome;
    String sobrenome;
    String numeroAgencia;
    Double saldo;
    Integer numeroConta;

    // Construtor
    public ContaBancaria(String nome, String sobrenome, String numeroAgencia, Double saldo, Integer numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    // método pra exibir as informações da conta
    public void exibirInformacoes() {
        System.out.println("Olá " + nome + " " + sobrenome + ",obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " ,conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
    
}
