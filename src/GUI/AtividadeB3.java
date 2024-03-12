/**
 * 
 */
package GUI;

import java.util.Random;
import java.util.Scanner;

/**
 *@author Rato
 */
public class AtividadeB3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random numGerado = new Random();
		Scanner scanIn = new Scanner(System.in); 
		
		int valor =numGerado.nextInt(100);
		int tentativas = 0;
		int numUser;
		
		do {
			System.out.println("Inisra um numero entre 1 e 100");
			numUser = scanIn.nextInt();
			
			if(numUser == valor)
			{
				System.out.println("O numeor esta certo");
				break;
			}
			else if(numUser < valor)
			{
				System.out.println("O numeor é maior");
			}
			else
			{
				System.out.println("O numeor é menor");
			}
			
			tentativas++;
			
		}while(tentativas <= 10);
		
		System.out.println("Utilizou"+ tentativas);
	}

}
