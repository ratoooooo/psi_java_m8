/**
 * 
 */
package GUI;

import java.util.Arrays;

/**
 *@author Rato
 */
public class AtividadeB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] arre; // declaração de um array de Inteiros 
		arre = new int[5]; // aloca espaço em memória para 5 inteiros // inicia valores e atribui valores a cada posição do array 
		arre[0] = 10; arre[1] = 32; arre[2] = 23; arre[3] = 14; arre[4] = 7;
		
		System.out.println("--Array original--");
		mostrarArray(arre);
		
		Arrays.sort(arre);
		
		System.out.println("--Array Ordenada--");
		mostrarArray(arre);
		
	}
	
	static void mostrarArray(int[] a)
	{
		int i;
		for(i=0; i < a.length; i++)
		{
			System.out.println("AElem: "+ (i+1) +":" +a[i]); 
		}
	}

}
