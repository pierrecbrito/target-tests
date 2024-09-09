package br.com.pierrecbrito.target;

import java.util.Scanner;

/*
 *  Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
 *  (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a 
 *  sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 * */

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = in.nextInt();
		System.out.println(isFibonacci(number) ? "Is Fibonacci" : "Is not Fibonacci");
		in.close();
	}
	
	public static boolean isFibonacci(int number) {
		int aux1 = 0;
		int aux2 = 1;
		int aux3 = 0;
		
		while(aux1 < number) {
			aux3 = aux2;
			aux2 = aux1 + aux2;
			aux1 = aux3;
		}	
		
		return aux1 == number;
	}

}
