package br.com.dio.desafios;

import java.util.Scanner;

public class xadrez {
	public static void main(String[] args) {
		 Scanner e = new Scanner(System.in);
	        int L = 100;
	        int C = 100;
	        int posL = 0;
	        int posC = 0;
	        int[][] tab = new int[L][C];

	        // Prenche a Matriz com as cores 0 para pretas
	        for (int i = 0; i < tab.length; i++) { // Inicio FOR - Matriz Linha
	            for (int j = 0; j < tab[i].length; j++) {  // Inicio FOR - Matriz Coluna
	                if ((i + j) % 2 == 0) { // Inicio IF - ( testa se a soma de Linha e Coluna é par)
	                    tab[i][j] = 1;

	                } else { // caso contrário é impar1!
	                    tab[i][j] = 0;
	                }
	            } // fim FOR - Matriz Coluna
	       
	        } // fim FOR - Matriz Linha

	        // Verificar Cor na posição solicitada

	                posL = e.nextInt();
	                posC = e.nextInt();

	                if (posL == 0 || posC == 0) {
	                    System.out.println("\nPosição Invalida!");
	                } else {
	                    System.out.println((tab[posL][posC]));
			e.close();
		}
	}

}
