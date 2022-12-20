    public class Conta {
        public static void main(String[] args) {

            ContaBancaria contaBancariaMae = new ContaBancaria("Natalia", 111, "001", "01/12/2022", 00);
            System.out.println(" ");
            System.out.println("**************** Inicializando teste na classe ContaBancaria **************** ");
            System.out.println(" ");
            System.out.println("A conta do (a) " + contaBancariaMae.getNomeTitular() +
                    " N.Conta " + contaBancariaMae.getNumeroConta() +
                    " Agencia " + contaBancariaMae.getAgencia());

            System.out.println("O saldo inicial é " + contaBancariaMae.getSaldo());
            System.out.println(" ");
            System.out.println("               Realizando depósito de R$ 100 na ContaBancaria  ");
            contaBancariaMae.depositar(100);
            System.out.println("O saldo após o primeiro depósito é " + contaBancariaMae.getSaldo());

            System.out.println(" ");
            System.out.println("               Realizando saque de R$ 10 na ContaBancaria               ");
            contaBancariaMae.sacar(10);
            System.out.println("O saldo após o primeiro saque é " + contaBancariaMae.getSaldo());

            System.out.println(" ");
            System.out.println("               Realizando saque de R$ 100 na ContaBancaria                ");
            contaBancariaMae.sacar(100);
            System.out.println("O saldo após o segundo saque é " + contaBancariaMae.getSaldo());

            System.out.println("**************** Finalizando teste na classe ContaBancaria **************** ");
            System.out.println(" ");

            System.out.println("A conta do (a) " + contaBancariaMae.getNomeTitular() +
                    " N.Conta " + contaBancariaMae.getNumeroConta() +
                    " Agencia " + contaBancariaMae.getAgencia());
            System.out.println("O saldo na ContaBancaria é " + contaBancariaMae.getSaldo());


            System.out.println("               FIM               ");
            System.out.println(" ");
            System.out.println("**************** Inicializando teste na classe ContaEspecial **************** ");
            System.out.println(" ");

            ContaEspecial contaEspecialFilha = new ContaEspecial(contaBancariaMae.getNomeTitular(), 1904,contaBancariaMae.getAgencia(),"2022/12/11", contaBancariaMae.atualizarSaldoAposTrasaçoes());
            System.out.println(contaEspecialFilha.toString());
            System.out.println(" Valor do limite na conta especial é de: " + contaEspecialFilha.getLimite());
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
            System.out.println("               FIM               ");
            System.out.println("**************** Finalizando teste na classe ContaEspecial **************** ");

            ContaPoupanca contaPoupanca = new ContaPoupanca(contaBancariaMae.getNomeTitular(), 1904,contaBancariaMae.getAgencia(),"2022/12/11", contaBancariaMae.atualizarSaldoAposTrasaçoes());
            System.out.println(" ");
            System.out.println("**************** Inicializando teste na classe Conta Poupanca **************** ");
            System.out.println(" ");
            System.out.println(contaPoupanca.toString());
            System.out.println(" ");
            System.out.println("               Inicializando deposito de R$ 1000 na classe Poupança                ");
            contaPoupanca.depositar(1000);
            System.out.println(" Saldo após o deposito é de :" + contaPoupanca.getSaldo());
            System.out.println("               Novo saldo após o depódito e calcula de rendimento na classe Poupança                ");
            System.out.println("O saldo após o rendimento é de " + contaPoupanca.calcularNovoSaldo(0.05));
        }
    }