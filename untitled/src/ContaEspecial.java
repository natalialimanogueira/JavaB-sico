public class ContaEspecial extends ContaBancaria{

    private float limite = 1000;
    public ContaEspecial(String nomeTitular, int numeroConta, String agencia, String dataAbertura, double saldo) {
        super(nomeTitular, numeroConta, agencia, dataAbertura, saldo);
        this.limite = limite;

    }
    public float getLimite() {

        return limite;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeTitular='" + super.getNomeTitular() + '\'' +
                ", numeroConta=" + super.getNumeroConta() +
                ", agencia='" + super.getAgencia() + '\'' +
                ", dataAbertura='" + super.getDataAbertura()+ '\'' +

                '}';
    }
    @Override
    public double sacar (double valor) {
        do {
            System.out.println("Valor do  saldo na contaBancaria antes de iniciar os saques no limite: " + super.getSaldo());
            //   300      1000
            if (valor <= limite) {
                //            90        -   100
                setSaldo(getSaldo() - valor);
                limite = (float) (limite - valor);
                System.out.println("O saldo atualizado na conta especial após o saque no limite é de: " + super.getSaldo());
                System.out.println("O limete atualizado na conta especial após o saque é de: " + getLimite());
            } else {
                System.out.println(" Saque na conta especial não foi realizado. Valor solicitado é superio ao limite.");
            }
            return getSaldo();
        } while(super.getSaldo() <= limite);
    }
}
