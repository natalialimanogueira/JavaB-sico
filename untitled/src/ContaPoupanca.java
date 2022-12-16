public class ContaPoupanca extends ContaBancaria {

    private int diaRedimento;
    private double rendimentoPoupanca;



    public ContaPoupanca(String nomeTitular, int numeroConta, String agencia,double saldo, String dataAbertura) {
        super(nomeTitular, numeroConta, agencia, saldo,  dataAbertura);
    }

    public double getRendimentoPoupanca() {
        return rendimentoPoupanca;
    }

    public int getDiaRedimento() {
        return diaRedimento;
    }

    public double calcularNovoSaldo(double taxa) {
            return rendimentoPoupanca = (this.getSaldo() * taxa);
        }


}
