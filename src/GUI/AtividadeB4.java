/**
 * 
 */
package GUI;

import java.util.Scanner;

/**
 *@author Rato
 */
public class AtividadeB4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int num1, num2, resultado=0;
		int op;
		Scanner scanIn = new Scanner(System.in); 
		
		System.out.println("Insira um numero");
		num1= scanIn.nextInt();
		
		System.out.println("Insira um numero");
		num2 = scanIn.nextInt();
		
		System.out.println("Insira uma opção");
		op = scanIn.nextInt();
		
		switch(op)
		{
		case 1:
			resultado  = num1+num2;
			break;
		case 2:
			resultado  = num1-num2;
			break;
		case 3:
			resultado  = num1*num2;
			break;
		case 4:
			if(num2 == 0)
			{
				System.out.println("Impoisvel dividr por 0");
			}
			else
			{
				resultado  = num1/num2;
			}
			break;
		default:
			System.out.println("Imposisvel dividir por 0");
			break;
		}
		
		System.out.println("Resultado: "+ resultado);
	}
}
