public class Conta{
    public static void main(String[] args) {

//     Testando a classe ContaBancaria
        ContaBancaria contaBancariaMae= new ContaBancaria("Natalia", 111, "001",00,00 "01/12/2022" );
        System.out.println("A conta do (a) " + contaBancariaMae.getNomeTitular() +
               " N.Conta " +  contaBancariaMae.getNumeroConta()  +
                " Agencia " + contaBancariaMae.getAgencia());

        System.out.println("O saldo inicial é " + contaBancariaMae.getSaldo() );
        contaBancariaMae.depositar(100);

        System.out.println("O saldo após o primeiro depósito é " + contaBancariaMae.getSaldo() );

        contaBancariaMae.sacar(10);
        System.out.println("O saldo após o primeiro saque é " + contaBancariaMae.getSaldo());
        contaBancariaMae.sacar(100);
        System.out.println("O saldo após o segundo saque é " + contaBancariaMae.getSaldo());
    }
    //  Testando a classe ContaEspecial
        ContaEspecial contaEspecialFilha = new ContaEspecial();



}