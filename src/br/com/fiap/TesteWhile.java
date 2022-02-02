package br.com.fiap;

import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
		
		//Looping
		//Laço de repetição
		
		Scanner leitor = new Scanner(System.in);
		String nome;
		int repeticoes;
		
		System.out.println("Digite seu nome:");
		nome = leitor.next();
		
		System.out.println("Quantidade de repetições?");
		repeticoes = leitor.nextInt();
		
		int contador = 1;
		
		while (contador <= repeticoes) {
			System.out.println(contador + " - " + nome);
			contador = contador + 1;
			
		}

	}

}
