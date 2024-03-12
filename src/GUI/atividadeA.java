/**
 * 
 */
package GUI;

/**
 *@author Rato
 */
public class atividadeA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int[] arre; // declaração de um array de Inteiros 
		arre = new int[5]; // aloca espaço em memória para 5 inteiros // inicia valores e atribui valores a cada posição do array 
		arre[0] = 10; arre[1] = 32; arre[2] = 23; arre[3] = 14; arre[4] = 7;
		
		for(i=0;i < arre.length; i++)
		{
			System.out.println("AElem: "+ (i+1) +":" +arre[i]); 
		}
		
		

	}

}
