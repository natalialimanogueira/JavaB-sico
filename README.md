Este Código é um código onde pratico o assunto de herança. 
A atividade proposta é descrita logo abaixo


Capacitação em JAVA - Sintaxe e Orientação a Objetos

A finalidade desse projeto é apresentar exercicíos para medir a proficiência ainda em nível básico da sintaxe e orientação a objetos em JAVA.

Exercícios
Crie um programa para gerenciar as contas de um banco.
A classe ContaBancaria deve ter o nome do titular (String), o número (int), a agência (String), o saldo (double) e uma data de abertura (String).

Além disso, a conta deve fazer as seguintes ações:

sacar para retirar um valor do saldo. Recebe um valor como parâmetro e o retira do saldo da conta;
depositar a fim de adicionar um valor ao saldo. Recebe um valor como parâmetro e o adiciona ao saldo da conta;
1.1) Agora acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupanca e ContaEspecial.

Na Classe ContaPoupanca deve conter o dia de rendimento (int) e o método calcularNovoSaldo() que recebe a taxa de rendimento da poupança e atualiza o saldo.

Na Classe ContaEspecial deve conter o atributo limite (float) e redefinição do método sacar (Override), permitindo que o saldo fique negativo até o valor do limite.

1.2) Após a implantação das classes acima, você deverá implementar uma classe Contas.java, contendo o método main. Nesta classe, você deverá implementar:

a) Incluir dados relativos a(s) conta(s) de um cliente;
b) Sacar um determinado valor da(s) sua(s) conta(s);
c) Depositar um determinado valor na(s) sua(s) conta(s);
d) Mostrar o novo saldo do cliente, a partir da taxa de rebdimento, daqueles que possuem conta poupança;
e) Mostrar os dados da(s) conta(s) de um cliente.
