package repository;

public class ContaTesteMain {
    public static void main(String[] args) {

        ContaBancariaRepository contaBancariaRepositoryMae = new ContaBancariaRepository("Natalia", 111, "001", "01/12/2022", 00.00);
        System.out.println(" ");
        System.out.println("**************** Inicializando teste na classe ContaBancaria **************** ");
        System.out.println(" ");
        System.out.println("A conta do(a) " + contaBancariaRepositoryMae.getNomeTitular() +
                " N.Conta " + contaBancariaRepositoryMae.getNumeroConta() +
                " Agencia " + contaBancariaRepositoryMae.getAgencia());

        System.out.println("O saldo inicial é R$: " + contaBancariaRepositoryMae.getSaldo());
        System.out.println(" ");
        System.out.println("               Realizando depósito de R$ 100 na ContaBancaria  ");
        contaBancariaRepositoryMae.depositar(100.00);
        System.out.println("O saldo da conta Bancaria após o primeiro depósito é R$: " + contaBancariaRepositoryMae.getSaldo());

        System.out.println(" ");
        System.out.println("               Realizando saque de R$ 10 na ContaBancaria               ");
        contaBancariaRepositoryMae.sacar(10.00);
        System.out.println("O saldo após o primeiro saque é R$: " + contaBancariaRepositoryMae.getSaldo());

        System.out.println(" ");
        System.out.println("               Realizando saque de R$ 100 na ContaBancaria                ");
        contaBancariaRepositoryMae.sacar(100.00);
        System.out.println("O saldo após o segundo saque é R$: " + contaBancariaRepositoryMae.getSaldo());
        System.out.println(" ");
        System.out.println("A conta do (a) " + contaBancariaRepositoryMae.getNomeTitular() +
                " N.Conta " + contaBancariaRepositoryMae.getNumeroConta() +
                " Agencia " + contaBancariaRepositoryMae.getAgencia());
        System.out.println("O saldo na ContaBancaria é R$ " + contaBancariaRepositoryMae.getSaldo());
        System.out.println("               FIM               ");
        System.out.println("**************** Finalizando teste na classe ContaBancaria **************** ");

        System.out.println(" ");
        System.out.println("**************** Inicializando teste na classe ContaEspecial **************** ");
        System.out.println(" ");

        ContaEspecial contaEspecialFilha = new ContaEspecial(contaBancariaRepositoryMae.getNomeTitular(), 1984, contaBancariaRepositoryMae.getAgencia(),"2022/12/11", contaBancariaRepositoryMae.atualizarSaldoAposTrasaçoes());
        System.out.println(contaEspecialFilha.toString());
        System.out.println(" Valor do limite na conta especial é de R$ : " + contaEspecialFilha.getLimite());
        System.out.println(" ");

        System.out.println("              Inicializando saque de R$ 300 na classe ContaEspecial               ");
        contaEspecialFilha.sacar(300);
        System.out.println(" ");
        System.out.println("               Inicializando saque de R$ 900 na classe ContaEspecial                ");
        contaEspecialFilha.sacar(900);
        System.out.println(" ");
        System.out.println("               Inicializando saque de R$ 700 na classe ContaEspecial                ");
        contaEspecialFilha.sacar(700);
        System.out.println(" ");
        System.out.println("               Situação do saldo na Conta Bancaria após as transações feitas na Conta Especial               ");
        System.out.println("O saldo na ContaBancaria é R$ " + contaBancariaRepositoryMae.getSaldo());
        System.out.println("               FIM               ");
        System.out.println("**************** Finalizando teste na classe ContaEspecial **************** ");

        ContaPoupanca contaPoupanca = new ContaPoupanca(contaBancariaRepositoryMae.getNomeTitular(), 1904, contaBancariaRepositoryMae.getAgencia(),"2022/12/11", contaBancariaRepositoryMae.atualizarSaldoAposTrasaçoes());
        System.out.println(" ");
        System.out.println("**************** Inicializando teste na classe Conta Poupanca **************** ");
        System.out.println(" ");
        System.out.println(contaPoupanca.toString());
        System.out.println(" ");
        System.out.println("               Inicializando deposito de R$ 1000 na classe Poupança                ");
        contaPoupanca.depositar(1000.00);
        System.out.println(" Saldo após o deposito é de R$ :" + contaPoupanca.getSaldo());
        System.out.println("               Novo saldo após o depódito e calcula de rendimento na classe Poupança                ");
        System.out.println("O saldo após o rendimento é de R$" + contaPoupanca.calcularNovoSaldo(0.05));
        System.out.println("               Situação do saldo na Conta Bancaria após as transações feitas na Conta Poupança");
        System.out.println("O saldo na ContaBancaria é R$ " + contaBancariaRepositoryMae.getSaldo());
    }
}
