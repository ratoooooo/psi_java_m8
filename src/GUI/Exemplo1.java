/**
 * 
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *@author Rato
 */
public class Exemplo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Esta é a minha primeira frame"); 
		
		frame.setSize(300, 300); 
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Sou uma Label");
		JButton button = new JButton();
		
		button.setText("Press Me");
		panel.add(label);//Adicionar a Label ao Panel
		panel.add(button);
		frame.add(panel);//Adicionar o Panel à Frame 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);

	}

}
