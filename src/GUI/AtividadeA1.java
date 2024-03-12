/**
 * 
 */
package GUI;

import java.util.Scanner;

/**
 *@author Rato
 */
public class AtividadeA1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in); 
		
		int num, resto;
		
		System.out.println("Insira um numero");
		num = scanIn.nextInt(); 
		
		resto = num % 2;
				
		if(resto == 0)
		{
			System.out.println("Par");
		}
		else
		{
			System.out.println("Impar");
		}
		
		System.out.println("O resto é "+resto);
	}
}
