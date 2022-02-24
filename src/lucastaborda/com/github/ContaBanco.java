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
			this.Saldo =  Valor + (Valor - (Valor * 0.02));
		} else
			this.Saldo = Valor + (Valor - (Valor * 0.01));
		return this.Saldo;
	}
	
	// Método Sacar
	public Double Sacar(Double Valor) {
	
		//System.out.println(TotalSaques);
		
		this.Valor = Valor;
		
		Double NovoValor = Valor;
		
		if(Valor > Saldo && Tipo.equals("PF")) {
			Valor = 0.0;
				System.out.println("");
				System.out.println("Saldo indisponível para saque");
		} else {
			
			if(TotalSaques < 3) {
				Saldo = Saldo - Valor;
					System.out.println("--- Saque ---");
					System.out.println("Saldo atual após o Saque de R$" + Valor + ": R$" + Saldo);
			
			} if(TotalSaques >= 3) {
				if(Tipo.equals("PF")) {
					NovoValor = (Saldo - (Saldo * 0.01)) - Valor;
						System.out.println("--- Saque ---");
						System.out.println("Saldo atual após o Saque de R$" + Valor + " já incluso taxa: R$" + NovoValor);	
				}
				else {
					NovoValor = Saldo - ((Saldo * 0.02)) - Valor;
						System.out.println("--- Saque ---");
						System.out.println("Saldo atual após o Saque de R$" + Valor + " já incluso taxa: R$" + NovoValor);	
				}
			
			}
			
		}
		
		TotalSaques++;
		
		return NovoValor;
	}
}

