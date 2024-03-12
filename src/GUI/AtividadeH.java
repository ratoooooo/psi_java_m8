/**
 * 
 */

/**
 * @author David Alexandre Santos
 */
package GUI;

import java.util.Arrays;

public class AtividadeH {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//int[] lista; //do tipo int, sem dimensão declarada
		//int[] lista = new int [5]; //com 5 posições
		//int[] lista = {1, 4, 25, 3, 25}; //com 5 posições de valor definido
		
		int[] arre; // declaração de um array de Inteiros
		arre = new int[5]; // aloca espaço em memória para 5 inteiros
		// inicia valores e atribui valores a cada posição do array
		arre[0] = 10;
		arre[1] = 32;
		arre[2] = 23;
		arre[3] = 14;
		arre[4] = 7;
		
		System.out.println("--Array original--");
		mostrarArray(arre);
		
		Arrays.sort(arre);
		
		System.out.println("--Array Ordenada--");
		mostrarArray(arre);

	}
	
	static void mostrarArray(int[] a)
	{
		System.out.println("Elem 1:"+a[0]);
		System.out.println("Elem 2:"+a[1]);
		System.out.println("Elem 3:"+a[2]);
		System.out.println("Elem 4:"+a[3]);
		System.out.println("Elem 5:"+a[4]);
	}

}
