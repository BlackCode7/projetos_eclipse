package projetos_eclipse;

import java.util.Scanner;

public class EstruturaRepeticaoFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fa�a um programa que lei um valor
		 * inteiro N e depois n n�meros inteiros
		 * Ao final mostrar a soma de n n�imeros inteiros
		 * **********************************************
		 * ENTRADA  SAIDA
		 * 3        11
		 * 5
		 * 2
		 * 4 
		*/  
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		//System.out.print("Digite a quantidade de n�meros");
		System.out.println(soma);
		sc.close();
	}

}
