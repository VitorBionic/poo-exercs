package metodo.ex2;

import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp = 'n';
		while (resp == 'n') {
			System.out.print("Valor da compra: ");
			double value = sc.nextDouble();
			System.out.printf("Valor Final: R$ %.2f%n", discount(value));
			
			System.out.println();
			System.out.print("Encerrar programa(s/n): ");
			resp = sc.next().toLowerCase().charAt(0);
		}
		
		sc.close();
	}
	
	public static double discount(double value) {
		if (value > 2000)
			return value * 0.9;
		else if (value > 1000 || value == 2000)
			return value * 0.95;
		else
			return value;
	}
}
