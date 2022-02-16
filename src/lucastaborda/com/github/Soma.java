package lucastaborda.com.github;
/* no terminal
 java -jar CalculadoraSoma.jar 1 2 3 */

public class Soma {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int resultado = n1 + n2;
		
		System.out.println("Soma: " + resultado);
		System.out.println("Soma: " + Integer.toBinaryString(resultado));
		System.out.println("Soma: " + Integer.toOctalString(resultado));
		System.out.println("Soma: " + Integer.toHexString(resultado));
		
	}
}


