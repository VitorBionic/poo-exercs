package metodo.ex1;

import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha a operação(1-4):");
		System.out.println("1) Adição");
		System.out.println("2) Subtração");
		System.out.println("3) Multiplicação");
		System.out.println("4) Divisão");
		System.out.println();
		System.out.print("Opção: ");
		int opc = sc.nextInt();
		
		double x, y;
		switch (opc) {
		case 1:
			System.out.print("1° valor: ");
			x = sc.nextDouble();
			System.out.print("2° valor: ");
			y = sc.nextDouble();
			System.out.println(x + " + " + y + " = " + Calculator.sum(x, y));
			break;
		case 2:
			System.out.print("1° valor: ");
			x = sc.nextDouble();
			System.out.print("2° valor: ");
			y = sc.nextDouble();
			System.out.println(x + " - " + y + " = " + Calculator.sub(x, y));
			break;
		case 3:
			System.out.print("1° valor: ");
			x = sc.nextDouble();
			System.out.print("2° valor: ");
			y = sc.nextDouble();
			System.out.println(x + " * " + y + " = " + Calculator.multi(x, y));
			break;
		case 4:
			System.out.print("1° valor: ");
			x = sc.nextDouble();
			System.out.print("2° valor: ");
			y = sc.nextDouble();
			try {
			    System.out.println(x + " / " + y + " = " + Calculator.div(x, y));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		
		sc.close();
	}
}
