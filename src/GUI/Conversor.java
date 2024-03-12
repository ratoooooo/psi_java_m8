package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.SpinnerUI;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Conversor {

	private JFrame frame;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor window = new Conversor();
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
	public Conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textResultado = new JTextField();
		textResultado.setEnabled(false);
		textResultado.setColumns(10);
		textResultado.setBounds(405, 69, 96, 29);
		frame.getContentPane().add(textResultado);
		
		JComboBox comboBoxOpcao = new JComboBox();
		comboBoxOpcao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxOpcao.setModel(new DefaultComboBoxModel(new String[] {"escolha uma opção", "cm - -m", "m - cm", "fah - cel", "cel - fah", "l - cl", "cl - l", "kg - g", "g - kg", "euro - dolar", "dolar - euro", "l - galoes", "galoes - l"}));
		comboBoxOpcao.setBounds(20, 137, 161, 29);
		frame.getContentPane().add(comboBoxOpcao);
		
		JLabel lblValorConverter = new JLabel("Valor a converter");
		lblValorConverter.setForeground(new Color(0, 0, 255));
		lblValorConverter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorConverter.setBounds(16, 69, 133, 24);
		frame.getContentPane().add(lblValorConverter);
		
		JLabel lblValorConvertido = new JLabel("Valor convertido");
		lblValorConvertido.setForeground(new Color(0, 0, 255));
		lblValorConvertido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorConvertido.setBounds(280, 69, 133, 24);
		frame.getContentPane().add(lblValorConvertido);
		
		JSpinner spinnerValorConverter = new JSpinner();
		spinnerValorConverter.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerValorConverter.setBounds(139, 69, 96, 29);
		frame.getContentPane().add(spinnerValorConverter);
		
		JButton btnConverter = new JButton("Converter Valor");
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConverter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int op = comboBoxOpcao.getSelectedIndex();
				double valor1 = (double) spinnerValorConverter.getValue();
				double resultado = 0;
				
				switch (op) {
			    case 1:
			        // cm to m
			        resultado = valor1 * 0.01;
			        break;
			    case 2:
			        // m to cm
			        resultado = valor1 / 0.01;
			        break;
			    case 3:
			        // fah to cel
			        resultado = (valor1 - 32) * (5.0 / 9.0);
			        break;
			    case 4:
			        // cel to fah
			        resultado = (valor1 * 9.0 / 5.0) + 32;
			        break;
			    case 5:
			        // l to cl
			        resultado = valor1 * 100.0;
			        break;
			    case 6:
			        // cl to l
			        resultado = valor1 / 100.0;
			        break;
			    case 7:
			        // kg to g
			        resultado = valor1 * 1000.0;
			        break;
			    case 8:
			        // g to kg
			        resultado = valor1 / 1000.0;
			        break;
			    case 9:
			        // euro to dol
			        resultado = valor1 * 1.1;  
			        break;
			    case 10:
			        // dol to euro
			        resultado = valor1 / 1.1;  
			        break;
			    case 11:
			        // l to galoes
			        resultado = valor1 * 0.264172;
			        break;
			    case 12:
			        // galoes to l
			        resultado = valor1 / 0.264172;
			        break;
			    default:
			        break;
			}

				textResultado.setText(String.format("%.2f", resultado));
			}
		});
		btnConverter.setBounds(206, 137, 167, 29);
		frame.getContentPane().add(btnConverter);
		

	}
}
