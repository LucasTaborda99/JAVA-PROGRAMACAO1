package lucastaborda.com.github;

public class Multiplicacao {
	
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int resultado = n1 * n2;
		
		System.out.println("Multiplicação: " + resultado);
		System.out.println("Multiplicação: " + Integer.toBinaryString(resultado));
		System.out.println("Multiplicação: " + Integer.toOctalString(resultado));
		System.out.println("Multiplicação: " + Integer.toHexString(resultado));
		
	}
}
