public class ContaBancaria {

    private String nomeTitular;
    private int numeroConta;
    private String agencia;
    private double saldo;
    private String dataAbertura;


    public ContaBancaria(String nomeTitular, int numeroConta, String agencia, String dataAbertura, double saldo) {

        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double setSaldo(double saldo) {
        this.saldo = saldo;
        return saldo;
    }

    public double sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Transação de saque realisada com sucesso.");
            System.out.println(atualizarSaldoAposTrasaçoes());

        } else {
            System.out.println("Não foi possivel realizar a transação");
            System.out.println("O valor solicitado foi superior ao valor disponivel no saldo");
            System.out.println(atualizarSaldoAposTrasaçoes());
        }
        return valor;
    }

    public double depositar(double valor) {
        if (valor >= 0) {
            saldo = saldo + valor;
            System.out.println("Transação de depósito realisada com sucesso.");
            System.out.println("Saldo atual na conta é :" + saldo);
            System.out.println(atualizarSaldoAposTrasaçoes());

        } else {
            System.out.println("Não foi possivel realizar a transação. O valor precisa ser maior que zero");
            System.out.println(atualizarSaldoAposTrasaçoes());
        }
        return valor;
    }
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", numeroConta=" + numeroConta +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", dataAbertura='" + dataAbertura + '\'' +
                '}';
    }
    public double atualizarSaldoAposTrasaçoes(){
            return saldo =  saldo;
    }
}


