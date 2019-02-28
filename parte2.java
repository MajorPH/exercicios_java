package salario;

import java.util.Scanner;

public class Salario {
	
	public static void main(String[] args) {
		
		double salarioFixo;
		double vendas;
		double salarioFinal;
		double comissao;
		
		
		Scanner scanner = new Scanner(System.in);
		
		salarioFixo = scanner.nextDouble();
		vendas = scanner.nextDouble();
		
		comissao = vendas * 0.04;
		salarioFinal = salarioFixo + comissao;
		
		System.out.println("Comissão = " + comissao);
		System.out.println("Salário Final = " + salarioFinal);
		
		scanner.close();
		
	}

}
