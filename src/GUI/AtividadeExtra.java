/**
 * 
 */
package GUI;

import java.util.Scanner;

/**
 *@author Rato
 */
public class AtividadeExtra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanIn = new Scanner(System.in); 
		double saldo = 0, valorCompra, carrCartao;
		int op;
		boolean sair = false;
		
		do
		{
			System.out.println("1-Comprar");
			System.out.println("2-Vereficar saldo");
			System.out.println("3-Careegar cartão");
			System.out.println("0-Sair");	
			op = scanIn.nextInt();
			
			switch(op)
			{
			case 1:
				System.out.println("Inisra o seu saldo");
				saldo = scanIn.nextDouble();
				
				System.out.println("Inisra o valor da compra");
				valorCompra = scanIn.nextDouble();
				
				if(saldo <= valorCompra)
				{
					System.out.println("O slado nao deixa realizar a cinta");
				}
				else
				{
					saldo -= valorCompra;
				}
				break;
			case 2:
				System.out.println("Saldo: " +saldo);
				break;
			case 3:
				System.out.println("Inisra o valor que deseja carregar");
				carrCartao = scanIn.nextDouble();
				saldo += carrCartao;
				break;
			case 0:
				System.out.println("Obrigado por usar o programa");	
				op = 0;
				break;
			default:
				System.out.println("Opção invalida");	
			}
		}while(op != 0 && sair == false);
		
	

	}

}
