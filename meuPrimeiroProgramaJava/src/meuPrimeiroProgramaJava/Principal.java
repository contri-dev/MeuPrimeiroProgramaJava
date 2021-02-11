/**
 * meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa java � construido dentro de um projeto Java
 * 2) Todo programa java deve ter uma classe com um m�todo main.
 * 3) Como exibir informa��es no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author 55119
 * data: 03/02/2021
 */
public class Principal { // Classe que contem o metodo principal.
	public static void main(String[] args) { // Este � o metodo principal
		System.out.println("Ol� amigo!\nQual � o seu nome?");
		
		// Ler uma string do console usando a biblioteca Scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Exibir um string com printf
		System.out.printf("Ola %s!", nome);
		in.close();
	}

}
