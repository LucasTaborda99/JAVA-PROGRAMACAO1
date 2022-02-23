# JAVA-PROGRAMACAO 1
Java - Programação 1 ☕ 💻

Calculadoras 
Desenvolva uma calculadora
-------------------------------

ContaBanco
Desenvolva uma classe que represente uma conta de banco, cada objeto criado a partir desta classe deverá ter os seguintes campos:
nome do titular
saldo da conta
número da conta
Tipo da Conta (PJ ou PF)


Esta classe deverá ter um método que permita depositar valores (receberá como parâmetro um Double) e também um método que poderá sacar valores (receberá como parâmetro um Double).


Depois criei uma classe Programa onde terá o método main, para executar esta classe. 

Crie dois objetos da conta e “brinque” com os métodos de sacar e depositar.

Por exemplo: 

Conta conta1 = new Conta("João da Silva", 789.99, "123456", "PF");
conta1.depositar(100.0); // a classe deve ter seu saldo para 889.99
conta1.sacar(500); // a classe deve ter seu saldo para 399.99

// Dica - Para imprimir o valor do saldo utilize System.out.println(conta1.saldo);

Regras de devem existir dentro da aplicação: 

Ao depositar um valor em uma conta PJ, deve ser cobrado 2% do valor, isto é se for depositado 100 deve somar 98 no saldo. 
Ao depositar um valor em uma conta PF, deve ser cobrado 1% do valor, isto é se for depositado 100 deve somar 99 no saldo. 
A conta do tipo PJ pode sacar um valor maior que o saldo existente e pode ficar com saldo negativo.
A conta do tipo PF não pode liberar um saque que deixe o saldo negativo, isto é, se o saque zerar a conta pode, só não pode deixar o saldo menor que zero. 
As contas tem uma limitação de três saques por instancia, ou seja se criar um objeto conta e executar quatro vezes o método sacar, na quarta em diante deve ser cobrado uma taxa, sendo 2% para PJ e 1% para PF. Exemplo conta PF tem um saldo de 100 reais após 3 saques, em um quarto saque no valor de 100 reais o retorno deve ser 99, pois 1 real foi cobrado de taxa. 
