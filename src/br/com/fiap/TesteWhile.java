package br.com.fiap;

import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
		
		//Looping
		//Laço de repetição
		
		Scanner leitor = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite seu nome:");
		nome = leitor.next();
		
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println(contador + " - " + nome);
			contador = contador + 1;
			
		}

	}

}
