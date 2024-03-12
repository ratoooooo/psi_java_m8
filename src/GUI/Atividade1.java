package GUI;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Atividade1 {

    private JFrame frame;
    private JTextField textLado1;
    private JTextField textLado2;
    private JTextField textLado3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Atividade1 window = new Atividade1();
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
    public Atividade1() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setForeground(new Color(0, 0, 0));
        frame.setBounds(100, 100, 482, 331);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 10, 263);
        frame.getContentPane().add(panel);

        textLado1 = new JTextField();
        textLado1.setBounds(85, 26, 96, 20);
        frame.getContentPane().add(textLado1);
        textLado1.setColumns(10);

        textLado2 = new JTextField();
        textLado2.setColumns(10);
        textLado2.setBounds(79, 96, 96, 20);
        frame.getContentPane().add(textLado2);

        textLado3 = new JTextField();
        textLado3.setColumns(10);
        textLado3.setBounds(79, 166, 96, 20);
        frame.getContentPane().add(textLado3);

        JLabel lblLado1 = new JLabel("Lado 1");
        lblLado1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblLado1.setForeground(new Color(0, 64, 128));
        lblLado1.setBounds(30, 27, 49, 14);
        frame.getContentPane().add(lblLado1);

        JLabel lblLado2 = new JLabel("Lado 2");
        lblLado2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblLado2.setForeground(new Color(0, 64, 128));
        lblLado2.setBounds(30, 97, 49, 14);
        frame.getContentPane().add(lblLado2);

        JLabel lblLado3 = new JLabel("Lado 3");
        lblLado3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblLado3.setForeground(new Color(0, 64, 128));
        lblLado3.setHorizontalAlignment(SwingConstants.TRAILING);
        lblLado3.setBounds(20, 167, 49, 14);
        frame.getContentPane().add(lblLado3);

        JLabel lblResultado = new JLabel("??");
        lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado.setBounds(226, 26, 208, 166);
        frame.getContentPane().add(lblResultado);

        JButton btnVerificarTipo = new JButton("Verificar Tipo");
        btnVerificarTipo.setBounds(66, 209, 120, 30);
        frame.getContentPane().add(btnVerificarTipo);

        // eventos
        btnVerificarTipo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String lado1 = textLado1.getText();
                String lado2 = textLado2.getText();
                String lado3 = textLado3.getText();

                if (lado1.equals("") || lado2.equals("") || lado3.equals("")) 
                {
                    JOptionPane.showMessageDialog(null, "Os lados devem estar preenchidos", "Aviso",JOptionPane.ERROR_MESSAGE);
                } 
                else 
                {
                    if (lado1.equals(lado2) && lado2.equals(lado3) && lado1.equals(lado3)) 
                    {
                    	lblResultado.setForeground(new Color(255, 0, 0));
                        lblResultado.setText("Equilátero");
                    } else if (lado1.equals(lado2) || lado2.equals(lado3) || lado1.equals(lado3)) 
                    {
                        lblResultado.setForeground(new Color(0, 128, 0));
                        lblResultado.setText("Isósceles");
                    } else 
                    {
                        lblResultado.setForeground(new Color(0, 64, 128));
                        lblResultado.setText("Escaleno");
                    }
                }
            }
        });
    }
}
