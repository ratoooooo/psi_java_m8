package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDesktopPane;
import javax.swing.JSpinner;

public class Atividade2 {

	private JFrame Calculadora;
	private JTextField textResultado;
	protected JOptionPane spinnerValor1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade2 window = new Atividade2();
					window.Calculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Atividade2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculadora = new JFrame();
		Calculadora.setBounds(100, 100, 450, 300);
		Calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculadora.getContentPane().setLayout(null);
		
		JLabel lblValor1 = new JLabel("Valor 1");
		lblValor1.setForeground(new Color(255, 0, 0));
		lblValor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor1.setBounds(10, 28, 66, 30);
		Calculadora.getContentPane().add(lblValor1);
		
		JLabel lblValor2 = new JLabel("Valor 2");
		lblValor2.setForeground(new Color(255, 0, 0));
		lblValor2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor2.setBounds(178, 28, 66, 30);
		Calculadora.getContentPane().add(lblValor2);
		
		JComboBox comboEscolhaOp = new JComboBox();
		comboEscolhaOp.setModel(new DefaultComboBoxModel(new String[] {"---------", "SOMA", "SUBTRACTION", "MULTIPLICACAO", "DIVISAO"}));
		comboEscolhaOp.setEditable(true);
		comboEscolhaOp.setBounds(24, 144, 102, 22);
		Calculadora.getContentPane().add(comboEscolhaOp);
		
		JLabel lbEscolhaOpl = new JLabel("Escolha a opção");
		lbEscolhaOpl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbEscolhaOpl.setBounds(24, 127, 141, 14);
		Calculadora.getContentPane().add(lbEscolhaOpl);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 1, 1);
		Calculadora.getContentPane().add(desktopPane);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(198, 168, 100, 43);
		Calculadora.getContentPane().add(lblResultado);
		
		textResultado = new JTextField();
		textResultado.setForeground(new Color(0, 0, 0));
		textResultado.setEnabled(false);
		textResultado.setBounds(284, 181, 96, 20);
		
		Calculadora.getContentPane().add(textResultado);
		textResultado.setColumns(10);

		JButton btnCaucula = new JButton("Caucula");
		btnCaucula.addMouseListener(new MouseAdapter() {
			private JOptionPane spinnerValor2;

			@Override
            public void mouseClicked(MouseEvent e) {
                int valor1 = (Integer) spinnerValor1.getValue(); 
                int valor2 = (Integer) spinnerValor2.getValue();
                int op = comboEscolhaOp.getSelectedIndex();
				
				if(op == 0)
				{
					JOptionPane.showMessageDialog(null, "Deve por os dois numeros", "Aviso", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				int res;
				
				switch (op) {
			    case 1:
			        // soma
			        res = valor1 + valor2;
			        textResultado.setText(Integer.toString(res));
			        break;
			    case 2:
			        // subtração
			        res = valor1 - valor2;
			        textResultado.setText(Integer.toString(res));
			        break;
			    case 3:
			        // multiplicação
			        res = valor1 * valor2;
			        textResultado.setText(Integer.toString(res));
			        break;
			    case 4:
			        // divisão
			        if (valor2 != 0) {
			            res = valor1 / valor2;
			            textResultado.setText(Integer.toString(res));
			        } else {
			            JOptionPane.showMessageDialog(null, "Não é possível dividir por zero", "Erro", JOptionPane.ERROR_MESSAGE);
			        }
			        break;
			    default:
			        JOptionPane.showMessageDialog(null, "Operação inválida", "Erro", JOptionPane.ERROR_MESSAGE);
			        break;
			}

				
				 	 	
		}});
		
		btnCaucula.setBounds(284, 212, 106, 23);
		Calculadora.getContentPane().add(btnCaucula);
		
		JSpinner spinnerValor1 = new JSpinner();
		spinnerValor1.setBounds(64, 30, 61, 30);
		Calculadora.getContentPane().add(spinnerValor1);
		
		JSpinner spinnerValor2 = new JSpinner();
		spinnerValor2.setBounds(237, 30, 61, 30);
		Calculadora.getContentPane().add(spinnerValor2);
		
		
	}
}