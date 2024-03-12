/**
 * 
 */
package GUI;

import java.util.Scanner;

/**
 *@author Rato
 */
public class AtividadeB2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanIn = new Scanner(System.in); 
		String nome;
		int trabP, notaTeste, relTP;
		double notaFinal;
		
		System.out.println("Insira o nome do aluno");
		nome = scanIn.nextLine();
		
		System.out.println("Insira a nota do trabalho pratico");
		trabP = scanIn.nextInt();
		
		System.out.println("Insira a nota do teste");
		notaTeste = scanIn.nextInt();
		
		System.out.println("Insira a nota do relatorio");
		relTP = scanIn.nextInt();
		
		
		notaFinal = 0.5 * trabP + 0.3 * notaTeste + 0.2 * relTP;
		
		System.out.println("A nota final foi"+notaFinal);

	}

}
