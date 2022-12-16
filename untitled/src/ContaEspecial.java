public class ContaEspecial extends ContaBancaria {

    private float limite = 1000;
    protected double novoSaldo = 0;

    public ContaEspecial(String nomeTitular, int numeroConta, String agencia, double saldo, String dataAbertura, double novoSaldo) {
        super(nomeTitular, numeroConta, agencia, saldo, dataAbertura);
        this.novoSaldo = novoSaldo;
    }
    public ContaEspecial() {

    }

    public float getLimite() {
        return limite;
    }

    public double getNovoSaldo() {
        return novoSaldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar (double valor) {
        if (valor <= limite) {
            novoSaldo = getSaldo() - valor;
            System.out.println("O saldo  atualizado é de:" + getSaldo());
            System.out.println("O novoSaldo  atualizado é de:" + novoSaldo);
            return true;
        }else{
            return false;
        }
    }




}
