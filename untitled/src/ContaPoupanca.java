public class ContaPoupanca extends ContaBancaria {

    private int diaRedimento;
    private double rendimentoPoupanca;



    public ContaPoupanca(double rendimentoPoupanca, String agencia, int numeroConta) {
        super(agencia, numeroConta);
        this.rendimentoPoupanca = rendimentoPoupanca;
    }

        public double calcularNovoSaldo(double taxa) {
            return rendimentoPoupanca = (this.getSaldo() * taxa);
        }


}
