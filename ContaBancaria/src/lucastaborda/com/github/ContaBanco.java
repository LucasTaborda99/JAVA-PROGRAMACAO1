package lucastaborda.com.github;

public class ContaBanco {

	// Atributos
	public String NomeTitular;
	public Double Saldo;
	public String Numero;
	public String Tipo;
	public Double Valor;
	
	// M�todo Construtor
	public ContaBanco (String NomeTitular, Double Saldo, String Numero, String Tipo) {
		this.NomeTitular = NomeTitular;
		this.Saldo = Saldo;
		this.Numero = Numero;
		this.Tipo = Tipo;
	}
	
	// M�todo Depositar
	public Double Depositar (Double Valor) {
		this.Valor = Valor;
		if(this.Tipo.equals("PJ")) {
			this.Saldo =  Valor + (Valor - (Valor * 0.02));
		} else
			this.Saldo = Valor + (Valor - (Valor * 0.01));
		return this.Saldo;
	}
	
	// M�todo Sacar
	public Double Sacar (Double Valor) {
		this.Valor = Valor;
		if(this.Tipo.equals("PJ")) {
			this.Saldo = this.Saldo - Valor;
			System.out.println("--- Saque ---");
			System.out.println("Saldo atual ap�s o Saque de R$" + this.Valor + ": R$" + this.Saldo);
		} else if(this.Tipo.equals("PF")) {
			if(this.Saldo >= Valor) {
				this.Saldo -= Valor;
				System.out.println("--- Saque ---");
				System.out.println("Saldo atual ap�s o Saque de R$" + this.Valor + ": R$" + this.Saldo);
			} else {
				System.out.println("--- Saque ---");
				System.out.println("Saldo insuficiente para saque.");
			}	
		}
		
				/*
				for(int Sacar = 0; Sacar >= 4; Sacar++) {
					this.Saldo = Saldo + (Valor - (Valor * 0.02));
					System.out.println("Voc� sacou mais de 3 vezes e agora esse � seu saldo j� incluso taxa: " + this.Saldo);
				}
				*/
		
		return this.Saldo;
	}
	
	// M�todo Conta Saques
	public void ContaSaques() {
		for(int Sacar = 0; Sacar >= 4; Sacar++) {
			this.Saldo = Saldo + (Valor - (Valor * 0.02));
			System.out.println("Voc� sacou mais de 3 vezes e agora esse � seu saldo j� incluso taxa: " + this.Saldo);
		}
		}
		
		
	}

