/**
 * 
 */
package GUI;

import java.util.Arrays;

/**
 *@author Rato
 */
public class AtividadeD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Atividade A
		System.out.println("Atividade A"); 
		int[] arre; // declaração de um array de Inteiros 
		arre = new int[5]; // aloca espaço em memória para 5 inteiros // inicia valores e atribui valores a cada posição do array 
		arre[0] = 10; arre[1] = 32; arre[2] = 23; arre[3] = 14; arre[4] = 7;
		
		for (int n : arre) {
		    System.out.println("AElem: " + (n + 1) + ":" + n);
		}
		
		//Atividade B
		System.out.println("Atividade B"); 
		int[] arr; // declaração de um array de Inteiros 
		arr = new int[5]; // aloca espaço em memória para 5 inteiros // inicia valores e atribui valores a cada posição do array 
		arr[0] = 10; arr[1] = 32; arr[2] = 23; arr[3] = 14; arr[4] = 7;
		
		System.out.println("--Array original--");
		mostrarArray(arr);
		
		Arrays.sort(arr);
		
		System.out.println("--Array Ordenada--");
		mostrarArray(arr);

		//Atividade C
		System.out.println("Atividade C"); 
		
        int[][] tabela = { 
                {1, 4, 25}, 
                {11, 2, 23}, 
                {3, 8, 9} 
            };
            
        for (int[] i : tabela) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

		

	}
	static void mostrarArray(int[] a)
	{
		int i;
		for(int n:a)
		{
			System.out.println("AElem: "+ (n+1) +":" + n); 
		}
	}

}
