package lucastaborda.com.github;

public class Programa {

	public static void main(String[] args) {
		
		ContaBanco conta1 = new ContaBanco("Jo�o da Silva", 100.00, "123456", "PJ");
			System.out.println("--- Cliente ---");
			System.out.println("Titular da Conta: " + conta1.NomeTitular);
			System.out.println("");
			System.out.println("--- Saldo ---");
			System.out.println("Saldo original: R$" + conta1.Saldo);
			System.out.println("");
		
		conta1.Depositar(100.00);
			System.out.println("--- Dep�sito ---");
			System.out.println("Saldo atual ap�s o Dep�sito de R$" + conta1.Valor + " j� incluso taxa: R$" + conta1.Saldo);
			System.out.println("");
		
		conta1.Sacar(10.00);
		conta1.Sacar(10.00);
		conta1.Sacar(10.00);
		conta1.Sacar(10.00);
		//conta1.Sacar(10.00);
		//conta1.Sacar(10.00);
		//conta1.Sacar(10.00);
		
	}
}
