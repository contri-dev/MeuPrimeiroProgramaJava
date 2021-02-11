/**
 * meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa java é construido dentro de um projeto Java
 * 2) Todo programa java deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author 55119
 * data: 03/02/2021
 */
public class Principal { 
	public static void main(String[] args) {
		
		
		// Saldação e pergunta o nome
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		// Ler o nome
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação específica para o nome lido
		System.out.printf("Ola %s!", nome);
		in.close();
	}

}
