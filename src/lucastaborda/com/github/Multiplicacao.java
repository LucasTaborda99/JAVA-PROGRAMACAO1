package lucastaborda.com.github;

public class Multiplicacao {
	
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int resultado = n1 * n2;
		
		System.out.println("Multiplica��o: " + resultado);
		System.out.println("Multiplica��o: " + Integer.toBinaryString(resultado));
		System.out.println("Multiplica��o: " + Integer.toOctalString(resultado));
		System.out.println("Multiplica��o: " + Integer.toHexString(resultado));
		
	}
}
