/**
 * 
 */
package GUI;

import java.util.Scanner;

/**
 *@author Rato
 */
public class AtividadeB5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanIn = new Scanner(System.in); 
		int num, i;
		
		do
		{
			System.out.println("Inisra um numer maior que 1");
			num = scanIn.nextInt();
			
		}while(num <= 1);
			
		for(i=2; i <= num; i+=2)
		{
			System.out.println(i);
		}
	}

}
