package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;

public class CalculadoraIMC {

	private JFrame frame;
	private JTextField textFieldImc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraIMC window = new CalculadoraIMC();
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
	public CalculadoraIMC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 831, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPeso.setBounds(56, 75, 141, 50);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAltura.setBounds(42, 136, 141, 50);
		frame.getContentPane().add(lblAltura);
		
		JSpinner spinnerPeso = new JSpinner();
		spinnerPeso.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerPeso.setBounds(134, 92, 131, 26);
		frame.getContentPane().add(spinnerPeso);
		
		JSpinner spinnerAltura = new JSpinner();
		spinnerAltura.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinnerAltura.setBounds(134, 153, 131, 26);
		frame.getContentPane().add(spinnerAltura);
		
		JButton btnCaucular = new JButton("Calcular IMC");
		btnCaucular.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCaucular.setBounds(75, 218, 190, 37);
		frame.getContentPane().add(btnCaucular);
		
		textFieldImc = new JTextField();
		textFieldImc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldImc.setForeground(new Color(0, 0, 255));
		textFieldImc.setBounds(518, 92, 96, 23);
		frame.getContentPane().add(textFieldImc);
		textFieldImc.setColumns(10);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblImc.setBounds(455, 75, 141, 50);
		frame.getContentPane().add(lblImc);
		
		JLabel lblNewLabel = new JLabel("___________________");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(37, 181, 302, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNivelImc = new JLabel("");
		lblNivelImc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNivelImc.setBounds(43, 274, 276, 54);
		frame.getContentPane().add(lblNivelImc);
		
		//events
		btnCaucular.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	double peso = (double) spinnerPeso.getValue();
		    	double altura = (double) spinnerAltura.getValue();
		    	double imc = peso / (altura * altura);

		        if(altura == 0 || peso == 0)
		        {
		        	JOptionPane.showMessageDialog(null, "Falta por dados na altura ou no peso", "Aviso",JOptionPane.ERROR_MESSAGE);
		        }
		        else 
		        {
		        	 textFieldImc.setText(String.format("%.2f", imc));
				        
				        if(imc <= 18.5)
				        {
				        	lblNivelImc.setText("Estas a baixo do peso ideal");
				        }
				        else if(imc > 18.5 && imc <= 24.9)
				        {
				        	lblNivelImc.setText("Estas no peso ideal");
				        }
				        else if(imc >= 25 && imc <= 29.9)
				        {
				        	lblNivelImc.setText("Estas com um peso execivo");
				        }
				        else
				        {
				        	lblNivelImc.setText("Estas com obsidade moderada");
				        }
		        }
		       
		    }
		});
	}
}