package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JogoQuiz {

    private JFrame frame;
    private JLabel lblPontos;
    private JLabel lblNumPontos;
    private int pontos = 0;
    private JButton btnOp1;
    private JButton btnOp2;
    private JButton btnOp3;
    private JButton btnOp4;
    private JPanel panelNum1;
    private JPanel panelNum2;
    private JButton btnPerg2Op1;
    private JButton btnPerg2Op2;
    private JButton btnPerg2Op4;
    private JButton btnPerg2Op3;
    private JLabel lblPergunta1;
    private JLabel lblPergunta2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JogoQuiz window = new JogoQuiz();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public JogoQuiz() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        panelNum1 = new JPanel();
        panelNum2 = new JPanel();

        frame.setBounds(100, 100, 977, 452);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Começar");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNewButton.setVisible(false);
                btnOp1.setVisible(true);
                btnOp2.setVisible(true);
                btnOp3.setVisible(true);
                btnOp4.setVisible(true);
                panelNum1.setVisible(true);
                lblNumPontos.setVisible(true);
                lblPontos.setVisible(true);
            }
        });

        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 46));
        btnNewButton.setBounds(319, 167, 301, 73);
        frame.getContentPane().add(btnNewButton);

        lblPontos = new JLabel("Pontos");
        lblPontos.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblPontos.setForeground(new Color(128, 128, 0));
        lblPontos.setBounds(10, 36, 127, 32);
        frame.getContentPane().add(lblPontos);
        lblPontos.setVisible(false);

        lblNumPontos = new JLabel("0");
        lblNumPontos.setBounds(20, 79, 61, 32);
        frame.getContentPane().add(lblNumPontos);

        panelNum1.setBounds(116, 0, 824, 396);
        frame.getContentPane().add(panelNum1);
        panelNum1.setLayout(null);
        panelNum1.setVisible(false);

        btnOp1 = new JButton("37");
        btnOp1.setBackground(new Color(255, 0, 0));
        btnOp1.setBounds(67, 153, 247, 90);
        panelNum1.add(btnOp1);
        btnOp1.setVisible(false);

        btnOp3 = new JButton("38");
        btnOp3.setBackground(new Color(0, 128, 255));
        btnOp3.setBounds(67, 254, 247, 90);
        panelNum1.add(btnOp3);
        btnOp3.setVisible(false);

        btnOp4 = new JButton("39");
        btnOp4.setBackground(new Color(255, 255, 0));
        btnOp4.setBounds(324, 254, 223, 90);
        panelNum1.add(btnOp4);
        btnOp4.setVisible(false);

        btnOp2 = new JButton("40");
        btnOp2.setBackground(new Color(0, 255, 128));
        btnOp2.setBounds(324, 153, 223, 90);
        panelNum1.add(btnOp2);

        panelNum2.setBounds(-14, 0, 814, 396);
        panelNum1.add(panelNum2);
        panelNum2.setLayout(null);
        panelNum2.setVisible(false);
        
        //pergunta 2
        btnPerg2Op1 = new JButton("Mercurio");
        btnPerg2Op1.setBackground(new Color(255, 0, 0));
        btnPerg2Op1.setBounds(67, 153, 247, 90);
        panelNum2.add(btnPerg2Op1);
        btnPerg2Op1.setVisible(false);

        btnPerg2Op2 = new JButton("Venus");
        btnPerg2Op2.setBackground(new Color(0, 255, 128));
        btnPerg2Op2.setBounds(324, 153, 247, 90);
        panelNum2.add(btnPerg2Op2);
        btnPerg2Op2.setVisible(false);

        btnPerg2Op4 = new JButton("Terra");
        btnPerg2Op4.setBackground(new Color(255, 255, 0));
        btnPerg2Op4.setBounds(324, 254, 247, 90);
        panelNum2.add(btnPerg2Op4);
        btnPerg2Op4.setVisible(false);

        btnPerg2Op3 = new JButton("Neptuno");
        btnPerg2Op3.setBackground(new Color(0, 128, 255));
        btnPerg2Op3.setBounds(67, 254, 247, 90);
        panelNum2.add(btnPerg2Op3);
        btnPerg2Op3.setVisible(false);

        lblPergunta1 = new JLabel("Quantos campeonatos tem o Benfica");
        lblPergunta1.setBounds(49, 52, 675, 88);
        panelNum1.add(lblPergunta1);
        lblPergunta1.setFont(new Font("Tahoma", Font.PLAIN, 38));

        lblPergunta2 = new JLabel("Qual o planeta mais perto do sol");
        lblPergunta2.setFont(new Font("Tahoma", Font.PLAIN, 38));
        lblPergunta2.setBounds(39, 31, 632, 95);
        panelNum2.add(lblPergunta2);

        //events
        //pergunta 1
        btnOp1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	vereficarResposta("37");
                
            }
        });

        btnOp2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	vereficarResposta("38");
                
            }
        });

        btnOp3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	vereficarResposta("39");
               
            }
        });

        btnOp4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	vereficarResposta("40");

            }
        });
        
        //pergunta 2
        btnPerg2Op1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		vereficarResposta("Mercurio");
        		
        	}
        });
        
        btnPerg2Op2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		vereficarResposta("Venus");
        		 
        	}
        });
        
        btnPerg2Op3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		vereficarResposta("Terra");
        		
        	}
        });
        
        btnPerg2Op4.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		vereficarResposta("Neptuno");
        		 
        	}
        });
        
    }

   
    private void vereficarResposta(String opSeleconada) {
        String respostCorreta1 = "37";
        String respostCorreta2 = "Mercurio";

        if (opSeleconada.equals(respostCorreta1)) {
            pontos += 10;
            JOptionPane.showMessageDialog(null, "A resposta está correta");
        } else {
            JOptionPane.showMessageDialog(null, "A resposta correta era " + respostCorreta1);
        }

        if (opSeleconada.equalsIgnoreCase(respostCorreta2)) {
            pontos += 10;
            JOptionPane.showMessageDialog(null, "A resposta está correta");
        } else {
            JOptionPane.showMessageDialog(null, "A resposta correta era " + respostCorreta2);
        }

        lblNumPontos.setText("" + pontos);
    }

}
