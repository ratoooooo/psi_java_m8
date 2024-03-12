/**
 * 
 */
package GUI;

import java.util.Scanner;

/**
 * @author Rato
 */
public class AtividadeI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome;
		double[] notas = new double [3];
		double media;
		
		Scanner scanIn = new Scanner(System.in);
		
		System.out.println("Insira o nome do aluno");
		
		nome = scanIn.nextLine();
		
		System.out.println("Insira a 1ª do aluno");
		
		notas[0] = scanIn.nextDouble();
		
		System.out.println("Insira a 2ª do aluno");
		
		notas[1] = scanIn.nextDouble();
		
		System.out.println("Insira a 3ª do aluno");
		
		notas[2] = scanIn.nextDouble();
		
		media = (notas[0] + notas[1] + notas[2])/3;
		
		System.out.println("Aluno: "+nome);
		System.out.println("Nota 1: "+notas[0]);
		System.out.println("Nota 2: "+notas[1]);
		System.out.println("Nota 3: "+notas[2]);
		System.out.println("Média: "+ media);
		
		scanIn.close();

	}

}
