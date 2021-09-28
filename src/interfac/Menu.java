package interfac;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class Menu implements ActionListener {
		
		// Criando paramentros paras as janelas
		
		private static JFrame janela = new JFrame("Menu");
		private static JLabel titulo = new JLabel("Menu Principal");
		private static JButton filme = new JButton("Filme");   // filme -> filme
		private static JButton ingresso = new JButton("Ingresso"); // ingresso -> ingresso
		private static JButton espectador = new JButton("Espectador"); // espectador -> espectador
		
		//public static ControleDados dados = new ControleDados();
	
		
		public Menu() {
			
			// Determinando tamanho dos ícones
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(120, 10, 150, 30);
			filme.setBounds(140, 50, 100, 30);
			ingresso.setBounds(140, 100, 100, 30);
			espectador.setBounds(140, 150, 100, 30);
			
			// Gerando janela com os parâmetros especificados
			
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(filme);
			janela.add(ingresso);
			janela.add(espectador);
			
			// Determinando tamanho padrão da janela
			
			janela.setSize(400, 250);
			janela.setResizable(false);
			janela.setLocationRelativeTo(null);	
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);
		}
		
		public static void main(String[] args) {
			Menu menu = new Menu();
			
			filme.addActionListener(menu);
			espectador.addActionListener(menu);
			ingresso.addActionListener(menu);
		}
		
		public void actionPerformed(ActionEvent acao) {
			
			// e disparando ações para o mesmo
			
			Object src = acao.getSource();
			
			if(src == filme)
				new TelaFilme() ;//mostrarDados(dados, 1)
				
			if(src == ingresso)
				new TelaIngresso() ;//mostrarDados(dados, 1)
				
			if(src == espectador)
				new TelaEspectador() // mostrarDados(dados, 2);
			
			
				;
		}
	}


