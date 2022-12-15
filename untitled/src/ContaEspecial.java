public class ContaEspecial extends ContaBancaria {

    private float limite = 1000;
    private double novoSaldo;

    public ContaEspecial(String nomeTitular, int numeroConta) {
        super(nomeTitular, numeroConta);

    }

    @Override
    public boolean sacar (double valor) {
        if (valor <= limite) {
            novoSaldo = getSaldo() - valor;
            return true;
        }else{
            return false;
        }
    }




}
