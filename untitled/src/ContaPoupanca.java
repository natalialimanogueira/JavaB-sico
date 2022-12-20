public class ContaPoupanca extends ContaBancaria {

    private int diaRedimento = 30;
    private double novoSaldo;

    public ContaPoupanca(String nomeTitular, int numeroConta, String agencia, String dataAbertura, double saldo) {
        super(nomeTitular, numeroConta, agencia, dataAbertura, saldo);
    }

    public int getDiaRedimento() {
        return diaRedimento;
    }
    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "nomeTitular='" + super.getNomeTitular()+ '\'' +
                ", numeroConta=" + "333" +
                ", agencia='" + super.getAgencia()+ '\'' +
                ", saldo=" + super.getSaldo() +

                '}';
    }
    public double calcularNovoSaldo(double taxa) {
        return setSaldo(diaRedimento * (super.getSaldo() * (taxa/100)) + super.getSaldo());

    }
}
