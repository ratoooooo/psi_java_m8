package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class JogoGalo {

	JFrame frame;
	private static JTextField textSupEsq;
	private static JTextField textSupMeio;
	private static JTextField textSupDir;
	private static JTextField textMeioEsq;
	private static JTextField textMeio;
	private static JTextField textMeioDir;
	private static JTextField textInfEsq;
	private static JTextField textInfMeio;
	private static JTextField textInfDir;
	private static boolean jogadorXAtivo = true;
	private static JLabel lblJogadorX;
	private static JLabel lblJogadorO;
	private static JLabel lblJogadorXPontos;
	private static JLabel lblJogadorOPontos;
	private static int pontosJogadorX = 0;
	private static int pontosJogadorO = 0;
 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoGalo window = new JogoGalo();
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
	public JogoGalo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		// Ajuste do tamanho da janela
		frame.setSize(564, 737);
		frame.setBounds(100, 100, 466, 821);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textSupEsq = new JTextField();
		textSupEsq.setFont(new Font("Tahoma", Font.BOLD, 18));
		textSupEsq.setEditable(false);
		textSupEsq.setHorizontalAlignment(SwingConstants.CENTER);
		textSupEsq.setBounds(23, 11, 131, 139);
		frame.getContentPane().add(textSupEsq);
		textSupEsq.setColumns(10);

		textSupMeio = new JTextField();
		textSupMeio.setFont(new Font("Tahoma", Font.BOLD, 18));
		textSupMeio.setEditable(false);
		textSupMeio.setHorizontalAlignment(SwingConstants.CENTER);
		textSupMeio.setColumns(10);
		textSupMeio.setBounds(167, 11, 131, 139);
		frame.getContentPane().add(textSupMeio);

		textSupDir = new JTextField();
		textSupDir.setFont(new Font("Tahoma", Font.BOLD, 18));
		textSupDir.setEditable(false);
		textSupDir.setHorizontalAlignment(SwingConstants.CENTER);
		textSupDir.setColumns(10);
		textSupDir.setBounds(308, 11, 131, 139);
		frame.getContentPane().add(textSupDir);

		textMeioEsq = new JTextField();
		textMeioEsq.setFont(new Font("Tahoma", Font.BOLD, 18));
		textMeioEsq.setEditable(false);
		textMeioEsq.setHorizontalAlignment(SwingConstants.CENTER);
		textMeioEsq.setColumns(10);
		textMeioEsq.setBounds(23, 173, 131, 139);
		frame.getContentPane().add(textMeioEsq);

		textMeio = new JTextField();
		textMeio.setFont(new Font("Tahoma", Font.BOLD, 18));
		textMeio.setEditable(false);
		textMeio.setHorizontalAlignment(SwingConstants.CENTER);
		textMeio.setColumns(10);
		textMeio.setBounds(167, 173, 131, 139);
		frame.getContentPane().add(textMeio);

		textMeioDir = new JTextField();
		textMeioDir.setFont(new Font("Tahoma", Font.BOLD, 18));
		textMeioDir.setEditable(false);
		textMeioDir.setHorizontalAlignment(SwingConstants.CENTER);
		textMeioDir.setColumns(10);
		textMeioDir.setBounds(308, 173, 131, 139);
		frame.getContentPane().add(textMeioDir);

		textInfEsq = new JTextField();
		textInfEsq.setFont(new Font("Tahoma", Font.BOLD, 18));
		textInfEsq.setEditable(false);
		textInfEsq.setHorizontalAlignment(SwingConstants.CENTER);
		textInfEsq.setColumns(10);
		textInfEsq.setBounds(23, 335, 131, 139);
		frame.getContentPane().add(textInfEsq);

		textInfMeio = new JTextField();
		textInfMeio.setFont(new Font("Tahoma", Font.BOLD, 18));
		textInfMeio.setEditable(false);
		textInfMeio.setHorizontalAlignment(SwingConstants.CENTER);
		textInfMeio.setColumns(10);
		textInfMeio.setBounds(167, 335, 131, 139);
		frame.getContentPane().add(textInfMeio);

		textInfDir = new JTextField();
		textInfDir.setFont(new Font("Tahoma", Font.BOLD, 18));
		textInfDir.setEditable(false);
		textInfDir.setHorizontalAlignment(SwingConstants.CENTER);
		textInfDir.setColumns(10);
		textInfDir.setBounds(308, 335, 131, 139);
		frame.getContentPane().add(textInfDir);

		JButton btnComecarJogo = new JButton("Começar Jogo");
		btnComecarJogo.setBounds(144, 485, 144, 23);
		frame.getContentPane().add(btnComecarJogo);

		lblJogadorX = new JLabel("Jogador X:");
		lblJogadorX.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogadorX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJogadorX.setBounds(23, 519, 148, 45);
		frame.getContentPane().add(lblJogadorX);

		lblJogadorO = new JLabel("Jogador 0:");
		lblJogadorO.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogadorO.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJogadorO.setBounds(217, 519, 144, 45);
		frame.getContentPane().add(lblJogadorO);
		
		lblJogadorXPontos = new JLabel("");
		lblJogadorXPontos.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogadorXPontos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJogadorXPontos.setBounds(144, 519, 111, 45);
		frame.getContentPane().add(lblJogadorXPontos);
		
		lblJogadorOPontos = new JLabel("");
		lblJogadorOPontos.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogadorOPontos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJogadorOPontos.setBounds(341, 519, 111, 45);
		frame.getContentPane().add(lblJogadorOPontos);

		// events
		textSupEsq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textSupEsq, textMeio, textInfDir);
			}
		});

		textSupDir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textSupDir, textMeioDir, textInfEsq);
			}
		});

		textSupMeio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textSupMeio, textMeio, textMeioDir);
			}
		});

		textMeioEsq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textMeioEsq, textMeio, textInfEsq);
			}
		});

		textMeio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textMeio, textMeioEsq, textMeioDir);
			}
		});

		textMeioDir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textMeioDir, textMeio, textInfDir);
			}
		});

		textInfEsq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textInfEsq, textInfMeio, textInfDir);
			}
		});

		textInfMeio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textInfMeio, textMeio, textSupMeio);
			}
		});

		textInfDir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				marcarCelula(textInfDir, textInfMeio, textInfDir);
			}
		});

		btnComecarJogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				reiniciarJogo();
			}
		});
	}

	private static void marcarCelula(JTextField celula1, JTextField celula2, JTextField celula3) {
	    if (celula1.getText().isEmpty()) {
	        if (jogadorXAtivo) {
	            celula1.setText("X");
	        } else {
	            celula1.setText("O");
	        }
	        jogadorXAtivo = !jogadorXAtivo;

	        if (verificarVitoria()) {
	            JOptionPane.showMessageDialog(null, "O jogador " + (jogadorXAtivo ? "X" : "O") + " venceu o jogo");
	           
	        }
	    }
	}


	private static boolean verificarVitoria() {
	    // Verificar linhas
	    if (verificarLinha(textSupEsq, textSupMeio, textSupDir) ||
	            verificarLinha(textMeioEsq, textMeio, textMeioDir) ||
	            verificarLinha(textInfEsq, textInfMeio, textInfDir)) {
	        atualizarPontuacao();
	        reiniciarJogo();
	        return true;
	    }

	    // Verificar colunas
	    if (verificarLinha(textSupEsq, textMeioEsq, textInfEsq) ||
	            verificarLinha(textSupMeio, textMeio, textInfMeio) ||
	            verificarLinha(textSupDir, textMeioDir, textInfDir)) {
	        atualizarPontuacao();
	        reiniciarJogo();
	        return true;
	    }

	    // Verificar diagonais
	    if (verificarLinha(textSupEsq, textMeio, textInfDir) ||
	            verificarLinha(textSupDir, textMeio, textInfEsq)) {
	        atualizarPontuacao();
	        reiniciarJogo();
	        return true;
	    }

	    return false;
	}

	private static void atualizarPontuacao() {
	    if (!jogadorXAtivo) {
	        pontosJogadorX++;
	        lblJogadorXPontos.setText(Integer.toString(pontosJogadorX));
	    } else {
	        pontosJogadorO++;
	        lblJogadorOPontos.setText(Integer.toString(pontosJogadorO));
	    }
	}

	
	private static boolean verificarLinha(JTextComponent celula1, JTextComponent celula2, JTextComponent celula3) {
		return celula1.getText().equals(celula2.getText()) && celula2.getText().equals(celula3.getText())
				&& !celula1.getText().isEmpty();
	}

	private static void reiniciarJogo() {
		textSupEsq.setText("");
		textSupMeio.setText("");
		textSupDir.setText("");
		textMeioEsq.setText("");
		textMeio.setText("");
		textMeioDir.setText("");
		textInfEsq.setText("");
		textInfMeio.setText("");
		textInfDir.setText("");
		jogadorXAtivo = true;
		
		//tualizarPontuacao();
	}
}