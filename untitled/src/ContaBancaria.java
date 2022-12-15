public class ContaBancaria {

    private String nomeTitular;
    private int numeroConta;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public ContaBancaria(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
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

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public boolean sacar (double valor){
        if(valor <= saldo ){
            saldo = saldo - valor;
            System.out.println("Transação Realisada com sucesso.");
            return true;
        }else{
            System.out.println("Não foi possivel realizar a transação");
            return false;
        }
    }

    public void depositar (double valor){
        if(valor >= 0) {
            saldo = saldo + valor;
            System.out.println("Transação Realisada com sucesso.");
            System.out.println("Saldo atual é de:" + saldo);
        }else{
            System.out.println("Não foi possivel realizar a transação. O valor precisa ser maior que zero");
        }
    }


}


