/**
 * meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa java √© construido dentro de um projeto Java
 * 2) Todo programa java deve ter uma classe com um m√©todo main.
 * 3) Como exibir informa√ß√µes no terminal (console) do Java.
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
		
		
		// Salda√ß√£o e pergunta o nome
		System.out.println("Ol√° amigo!\nQual √© o seu nome?");
		
		// Ler o nome
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// SaldaÁ„o especÌfica para o nome lido.
		System.out.printf("Ola %s!", nome);
		
		// Perguntar a idade
		System.out.printf("%s, Qual sua idade?", nome);
		
		Integer idade = in.nextInt();
		
		System.out.printf("%d!, Puxa, como vocÍ È jovem!", idade);
		in.close();
	}

}
