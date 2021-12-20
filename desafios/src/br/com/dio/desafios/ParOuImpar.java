package br.com.dio.desafios;

import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int num = 0;
		int N = leitor.nextInt();

		if (N < 10000) {
			for (int i = 0; i < N; i++) {
				num = leitor.nextInt();
				if (num % 2 == 0 & num < 0) {
					System.out.println("EVEN NEGATIVE");

				} else if (num % 2 == 0 & num > 0) {
					System.out.println("EVEN POSITIVE");

				} else if (num % 2 != 0 & num < 0) {
					System.out.println("ODD NEGATIVE");

				} else if (num % 2 != 0 & num > 0) {
					System.out.println("ODD POSITIVE");

				} else if (num == 0) {
					System.out.println("NULL");
				}
			}
		} else {
			System.out.println("Valor inválido!");
		}
	}
}
