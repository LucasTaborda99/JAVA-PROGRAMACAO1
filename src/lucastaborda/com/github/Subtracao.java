package lucastaborda.com.github;

public class Subtracao {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int resultado = n1 - n2;
		
		System.out.println("Subtra��o: " + resultado);
		System.out.println("Subtra��o: " + Integer.toBinaryString(resultado));
		System.out.println("Subtra��o: " + Integer.toOctalString(resultado));
		System.out.println("Subtra��o: " + Integer.toHexString(resultado));
		
	}
}
