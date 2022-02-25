package lucastaborda.com.github;

public class ContaBanco {

	// Atributos
	public String NomeTitular;
	public Double Saldo;
	public String Numero;
	public String Tipo;
	public Double Valor;
	public Integer TotalSaques = 0;
	
	// Método Construtor
	public ContaBanco (String NomeTitular, Double Saldo, String Numero, String Tipo) {
		this.NomeTitular = NomeTitular;
		this.Saldo = Saldo;
		this.Numero = Numero;
		this.Tipo = Tipo;
	}
	
	// Método Depositar
	public Double Depositar (Double Valor) {
		this.Valor = Valor;
			if(this.Tipo.equals("PJ")) {
			this.Saldo =  Saldo + (Valor - (Valor * 0.02));
		} else
			this.Saldo = Saldo + (Valor - (Valor * 0.01));
		return this.Saldo;
	}
	
	// Método Sacar
	public Double Sacar(Double Valor) {
	
		//System.out.println(TotalSaques);
		
		this.Valor = Valor;
		
		if(Valor > Saldo && Tipo.equals("PF")) {
			Valor = 0.0;
				System.out.println("Saldo indisponível para saque");
				System.out.println("");
				return Saldo;
		} else {
			if(TotalSaques >= 3) {
				if(Tipo.equals("PF")) {
					Saldo = (Saldo - Valor - (Valor * 0.01)) ;
						System.out.println("--- Saque ---");
						System.out.println("Saldo atual após o Saque de R$" + Valor + " já incluso taxa: R$" + Saldo);	
				}
				else {
					Saldo = Saldo - Valor - ((Valor * 0.02));
						System.out.println("--- Saque ---");
						System.out.println("Saldo atual após o Saque de R$" + Valor + " já incluso taxa: R$" + Saldo);	
				}
			
			} else {
				Saldo = Saldo - Valor;
					System.out.println("--- Saque ---");
					System.out.println("Saldo atual após o Saque de R$" + Valor + ": R$" + Saldo);
		}
		
		TotalSaques++;
		
		return Saldo;
		
		}
	}
}

