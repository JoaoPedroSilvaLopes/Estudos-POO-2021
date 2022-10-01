package testeAutenticacao;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDeAviso extends JFrame {
	
	private JLabel textoFinal;
	
	public TelaDeAviso(String texto) {
		setTitle("Autenticação");
		setSize(350, 125);
		setUndecorated(false);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		textoFinal = new JLabel(texto);
		textoFinal.setBounds(70, 0, 200, 100);
		add(textoFinal);
		setVisible(true);
	}
}