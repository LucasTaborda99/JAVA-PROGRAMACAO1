package lucastaborda.com.github;

public class Divisao {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int resultado = n1 / n2;
		
		System.out.println("Divis�o: " + resultado);
		System.out.println("Divis�o: " + Integer.toBinaryString(resultado));
		System.out.println("Divis�o: " + Integer.toOctalString(resultado));
		System.out.println("Divis�o: " + Integer.toHexString(resultado));

	}
}
