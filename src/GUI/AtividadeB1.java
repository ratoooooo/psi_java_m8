/**
 * 
 */
package GUI;

import java.util.Scanner;

/**
 *@author Rato
 */
public class AtividadeB1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanIn = new Scanner(System.in); 
		
		double larg, comp, area, perim;
		
		System.out.println("Insira o comprimernto");
		comp = scanIn.nextInt();
		
		System.out.println("Insira a largura");
		larg = scanIn.nextInt();
		
		area = comp * larg;
		
		perim = 2*comp + 2*larg;
		
		System.out.println("area ="+area+"perimetro = "+perim);
		
		
		
		
	}

}
