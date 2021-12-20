package br.com.dio.desafios;

import java.util.Locale;
import java.util.Scanner;

public class MacPRONALTS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int qtdP, produto, tipo;
		double valor = 0, total = 0;

		tipo = sc.nextInt();

		for (int i = 1; i <= tipo; i++) {

			produto = sc.nextInt();

			qtdP = sc.nextInt();

			if (produto == 1001) {
				valor = 1.50;
			} else if (produto == 1002) {
				valor = 2.50;
			} else if (produto == 1003) {
				valor = 3.50;
			} else if (produto == 1004) {
				valor = 4.50;
			} else if (produto == 1005) {
				valor = 5.50;
			} else {
				System.out.println("Produto Inválido!");
			}
			total += valor * qtdP;
		}
		System.out.printf("%.2f\n", total);
		sc.close();
	}

}
