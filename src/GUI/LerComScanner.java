/**
 * 
 */
package GUI;

import java.util.Scanner;

/**
 * @author Rato
 */
public class LerComScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanIn = new Scanner(System.in);
		
		System.out.println("Indique o seu nome:");
		String nome = scanIn.nextLine();
		System.out.println("Olá " + nome);
		
		scanIn.close();

	}

}
