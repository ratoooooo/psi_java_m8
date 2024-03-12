/**
 * 
 */
package GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Rato
 */
public class LerComBuffer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		System.out.println("Indique o seu nome:");
		String nome = reader.readLine();
		
		System.out.println("Olá " + nome);
		reader.close();
		input.close();


	}

}
