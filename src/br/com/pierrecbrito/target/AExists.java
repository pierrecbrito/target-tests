package br.com.pierrecbrito.target;

import java.util.Scanner;

/**
 *  Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
 *  seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
*/

public class AExists {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String text = in.nextLine();
		in.close();
		
        System.out.println(aExists(text) ? "A Exists with " + countA(text) + " occurrences" : "A does not exist");
	}
	
	public static boolean aExists(String text) {
		return text.toLowerCase().indexOf("a") != -1;
	}
	
	public static int countA(String text) {
		return text.length() - text.toLowerCase().replace("a", "").length();
	}

}
