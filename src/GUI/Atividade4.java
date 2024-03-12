package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Atividade4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade4 window = new Atividade4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Atividade4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblValor = new JLabel("Valorl");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValor.setBounds(21, 179, 63, 33);
		frame.getContentPane().add(lblValor);
		
		JSpinner spinnerNumero = new JSpinner();
		spinnerNumero.setModel(new SpinnerNumberModel(0, null, 5, 1));
		spinnerNumero.setBounds(78, 187, 30, 20);
		frame.getContentPane().add(spinnerNumero);
		
		JLabel lblGenio = new JLabel("New label");
		lblGenio.setIcon(new ImageIcon("D:\\87-873210_akinator-with-transparent-background.png"));
		lblGenio.setBounds(183, 60, 308, 442);
		frame.getContentPane().add(lblGenio);
		
		Random numGerado = new Random();
		int valor = numGerado.nextInt(5);
		
		JButton btnPalpite = new JButton("Palpite");
		btnPalpite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numPalpite = (Integer) spinnerNumero.getValue();
				if(numPalpite == valor)
				{
					JOptionPane.showMessageDialog(null, "Parabens acertaste o numero", "Genio", JOptionPane.OK_OPTION);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Erraste tenta de novo", "Genio", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnPalpite.setBounds(31, 223, 89, 23);
		frame.getContentPane().add(btnPalpite);
		

	}
}
