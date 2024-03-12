package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Atividade5 {

	private JFrame frame;
	private JTextField textFieldMonitor;
	private JTextField textFieldPrefericos;
	private JTextField textFieldSubTotall;
	private JTextField textFieldIva;
	private JTextField textFieldTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade5 window = new Atividade5();
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
	public Atividade5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("PC -SHOP");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNome.setBounds(201, 11, 101, 35);
		frame.getContentPane().add(lblNome);
		
		JLabel lblTracos = new JLabel("--------------------------------------------");
		lblTracos.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTracos.setBounds(70, 34, 418, 22);
		frame.getContentPane().add(lblTracos);
		
		JPanel panelOpcao = new JPanel();
		panelOpcao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Op\u00E7\u00E3o Monitor", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelOpcao.setBounds(28, 81, 241, 83);
		frame.getContentPane().add(panelOpcao);
		panelOpcao.setLayout(null);
		
		JRadioButton rdbtnMonitorCrt = new JRadioButton("Monitor CRT - 100");
		rdbtnMonitorCrt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnMonitorCrt.setBounds(6, 21, 178, 23);
		panelOpcao.add(rdbtnMonitorCrt);
		
		JRadioButton rdbtnMonitorLcd = new JRadioButton("Monitor LCD - 400");
		rdbtnMonitorLcd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnMonitorLcd.setBounds(6, 47, 178, 23);
		panelOpcao.add(rdbtnMonitorLcd);
		
		JPanel panelPrefericos = new JPanel();
		panelPrefericos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Prefericos", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelPrefericos.setBounds(28, 175, 241, 117);
		frame.getContentPane().add(panelPrefericos);
		panelPrefericos.setLayout(null);
		
		JRadioButton rdbtnWebCam = new JRadioButton("WebCam - 50");
		rdbtnWebCam.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnWebCam.setBounds(27, 53, 178, 23);
		panelPrefericos.add(rdbtnWebCam);
		
		JRadioButton rdbtnImpressora = new JRadioButton("Impressora - 100");
		rdbtnImpressora.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnImpressora.setBounds(27, 27, 178, 23);
		panelPrefericos.add(rdbtnImpressora);
		
		JRadioButton rdbtnScanner = new JRadioButton("Scanner- 50");
		rdbtnScanner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnScanner.setBounds(27, 79, 178, 23);
		panelPrefericos.add(rdbtnScanner);
		
		JLabel lblPrecoBase = new JLabel("Preço Base");
		lblPrecoBase.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecoBase.setBounds(289, 67, 116, 47);
		frame.getContentPane().add(lblPrecoBase);
		
		JLabel lblMonitor = new JLabel("Monitor");
		lblMonitor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMonitor.setBounds(289, 125, 116, 47);
		frame.getContentPane().add(lblMonitor);
		
		JLabel lblPrefericos = new JLabel("Perefericos");
		lblPrefericos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrefericos.setBounds(289, 183, 116, 47);
		frame.getContentPane().add(lblPrefericos);
		
		JLabel lblSabTotal = new JLabel("Subtotal");
		lblSabTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSabTotal.setBounds(289, 241, 116, 47);
		frame.getContentPane().add(lblSabTotal);
		
		textFieldMonitor = new JTextField();
		textFieldMonitor.setEnabled(false);
		textFieldMonitor.setBounds(374, 140, 96, 20);
		frame.getContentPane().add(textFieldMonitor);
		textFieldMonitor.setColumns(10);
		
		textFieldPrefericos = new JTextField();
		textFieldPrefericos.setEnabled(false);
		textFieldPrefericos.setColumns(10);
		textFieldPrefericos.setBounds(374, 198, 96, 20);
		frame.getContentPane().add(textFieldPrefericos);
		
		textFieldSubTotall = new JTextField();
		textFieldSubTotall.setEnabled(false);
		textFieldSubTotall.setColumns(10);
		textFieldSubTotall.setBounds(374, 256, 96, 20);
		frame.getContentPane().add(textFieldSubTotall);
		
		JLabel lblNewLabel_1_1 = new JLabel("----------------------------");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1_1.setBounds(275, 335, 418, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textFieldIva = new JTextField();
		textFieldIva.setEnabled(false);
		textFieldIva.setColumns(10);
		textFieldIva.setBounds(374, 302, 96, 20);
		frame.getContentPane().add(textFieldIva);
		
		JLabel lblIva = new JLabel("IVA");
		lblIva.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIva.setBounds(289, 287, 116, 47);
		frame.getContentPane().add(lblIva);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(289, 356, 116, 47);
		frame.getContentPane().add(lblTotal);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setEnabled(false);
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(374, 371, 96, 20);
		frame.getContentPane().add(textFieldTotal);
		
		JSpinner spinnerPrecoBase = new JSpinner();
		spinnerPrecoBase.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(50)));
		spinnerPrecoBase.setBounds(374, 81, 96, 20);
		frame.getContentPane().add(spinnerPrecoBase);
		
		JButton btnNewButton = new JButton("Efetuar Calculos\r\n\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int precoBase = (Integer) spinnerPrecoBase.getValue();
				int monitor = 0;
				int prefericos = 0;
				
				 if (rdbtnMonitorCrt.isSelected()) {
			            monitor += 100;
			        }
				 else if(rdbtnMonitorLcd.isSelected()) {
			            monitor += 400;
			        }

			        if (rdbtnScanner.isSelected()) {
			            prefericos += 50;
			        }

			        if (rdbtnImpressora.isSelected()) {
			            prefericos += 100; 
			        }
			        
			        if (rdbtnWebCam.isSelected()) {
			            prefericos += 50; 
			        }
			        
				int subTotal = prefericos + precoBase + monitor;
				double iva = subTotal * 0.23;
				double precoFinal = iva + subTotal;
				
				textFieldMonitor.setText(Integer.toString(monitor));
				textFieldPrefericos.setText(Integer.toString(prefericos));
				textFieldSubTotall.setText(Integer.toString(subTotal));
				textFieldIva.setText(Double.toString(iva));
				textFieldTotal.setText(Double.toString(precoFinal));
				
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(254, 429, 171, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
