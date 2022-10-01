package testeAutenticacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*	USUÁRIOS:/- fulano/- beltrano/- admin
	
	SENHA:/- ful35/- tran40/- sal1000 */

public class Autenticacao extends JFrame {
	
	private JTextField caixadetexto;
	private JPasswordField caixadesenha;
	private JLabel labelUsuario;
	private JLabel labelSenha;
	private JButton botaoLogin;
	private JButton botaoSair;
	
	public Autenticacao () {
		setTitle("Autenticação");
		setSize(500, 250);
		setUndecorated(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}
	
	public void initComponents() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		//
		labelUsuario = new JLabel("Usuário:");
		labelSenha = new JLabel("Senha:");
		caixadetexto = new JTextField();
		caixadesenha = new JPasswordField();
		botaoLogin = new JButton("Login");
		botaoSair = new JButton("Sair");
		//
		labelUsuario.setBounds(100, 0, 100, 100);
		labelSenha.setBounds(100, 40, 100, 100);
		caixadetexto.setBounds(160, 40, 200, 20);
		caixadesenha.setBounds(160, 80, 200, 20);
		botaoLogin.setBounds(160, 120, 70, 20);
		botaoSair.setBounds(280, 120, 70, 20);
		//
		add(labelUsuario); add(labelSenha); add(caixadetexto);
		add(caixadesenha); add(botaoLogin); add(botaoSair);
		//
		caixadetexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caixadesenha.requestFocus();
			}
		});
		//
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		//
		Validacao validar = new Validacao();
		botaoLogin.addActionListener(validar);
		caixadesenha.addActionListener(validar);
	}
		
	private class Validacao implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			char[] charSenha = caixadesenha.getPassword();
			String stringSenha = String.valueOf(charSenha);
			
			if (caixadetexto.getText().equals("fulano")) {
				if(stringSenha.equals("ful35")) {
					new TelaDeAviso("Login feito com sucesso!");
				}
				else if (!stringSenha.equals("ful35")) {
					new TelaDeAviso("Senha incorreta");
				}
			}
			else if (caixadetexto.getText().equals("beltrano")) {
				if(stringSenha.equals("tran40")) {
					new TelaDeAviso("Login feito com sucesso!");
				}
				else if (!stringSenha.equals("tran40")) {
					new TelaDeAviso("Senha incorreta");
				}
			}
			else if (caixadetexto.getText().equals("admin")){
				if(stringSenha.equals("sal1000")) {
					new TelaDeAviso("Login feito com sucesso!");
				}
				else if (!stringSenha.equals("sal1000")) {
					new TelaDeAviso("Senha incorreta");
				}
			}
			else if (caixadetexto.getText().equals("")) {
				new TelaDeAviso("Insira um nome de usuário.");
			}
			else {
				new TelaDeAviso("Esse nome de usuário não existe.");
			}
		}
	}
	
	public static void main(String args[]) {
		new Autenticacao();
	}	
}