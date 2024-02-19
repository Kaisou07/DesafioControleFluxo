import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
			try {
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException exception) {
				System.out.println("O segundo parâmetro deve ser maior que o primeiro"); 
			}
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
	          throw new ParametrosInvalidosException();
		}else {
			int contagem = parametroDois - parametroUm;
			
			for(int numero=1; numero <= contagem; numero++) {
				System.out.println("Imprimindo o numero " + numero);
			}
		}
		
	}
}













/*		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro"); 
		}*/