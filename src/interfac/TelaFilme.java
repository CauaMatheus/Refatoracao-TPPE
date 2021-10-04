package interfac;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleDados;
import control.ControleEspectador;
import control.ControleFilme;
import control.ControleIngresso;

public class TelaFilme implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroFilme;
	private JButton refreshFilme;
	private JButton cadastroEspectador;
	private JButton refreshEspectador;
	private JButton cadastroIngresso;
	private JButton refreshIngresso;

	private static ControleDados dados;
	private JList<String> listaMovie;
	private JList<String> listaEspectador;
	private JList<String> listaIngresso;
	private String[] listaNomes = new String[100];
	private String[] listaID = new String[100];

	public void mostrarDados(ControleDados d, int esc) {
		dados = d;

		// ds
		// Mostrar dados de filmes cadastrados (JList)

		switch (esc) {
		case 1:
			listaNomes = new ControleFilme(dados).getNomeFilme();
			listaMovie = new JList<String>(listaNomes);

			janela = new JFrame("Filmes");
			titulo = new JLabel("Filmes Cadastrados");
			cadastroFilme = new JButton("Cadastrar");
			refreshFilme = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);

			listaMovie.setBounds(20, 50, 350, 120);
			listaMovie.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaMovie.setVisibleRowCount(10);

			cadastroFilme.setBounds(70, 177, 100, 30);
			refreshFilme.setBounds(200, 177, 100, 30);

			janela.setLayout(null);
			janela.setResizable(false);
			janela.setLocationRelativeTo(null);

			janela.add(titulo);
			janela.add(listaMovie);
			janela.add(cadastroFilme);
			janela.add(refreshFilme);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroFilme.addActionListener(this);
			refreshFilme.addActionListener(this);
			listaMovie.addListSelectionListener(this);
			break;

		case 2:

			listaNomes = new ControleEspectador(dados).getNome();
			listaEspectador = new JList<String>(listaNomes);

			janela = new JFrame("Espectadores Cadastrados");
			titulo = new JLabel("Espectadores ");
			cadastroEspectador = new JButton("Cadastrar");
			refreshEspectador = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);

			listaEspectador.setBounds(20, 50, 350, 120);
			listaEspectador.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaEspectador.setVisibleRowCount(10);

			cadastroEspectador.setBounds(70, 177, 100, 30);
			refreshEspectador.setBounds(200, 177, 100, 30);

			janela.setLayout(null);
			janela.setResizable(false);
			janela.setLocationRelativeTo(null);

			janela.add(titulo);
			janela.add(listaEspectador);
			janela.add(cadastroEspectador);
			janela.add(refreshEspectador);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroEspectador.addActionListener(this);
			refreshEspectador.addActionListener(this);
			listaEspectador.addListSelectionListener(this);
			break;

		case 3:

			listaNomes = new ControleIngresso(dados).getNomeIngresso();
			// listaID = new ControleIngresso(dados).getIdIngresso();

			listaIngresso = new JList<String>(listaNomes);

			janela = new JFrame("Ingressos Cadastrados");
			titulo = new JLabel("Ingressos");
			cadastroIngresso = new JButton("Novo");
			refreshFilme = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(125, 10, 250, 30);

			listaIngresso.setBounds(20, 50, 350, 120);
			listaIngresso.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaIngresso.setVisibleRowCount(10);

			cadastroIngresso.setBounds(70, 177, 100, 30);
			refreshFilme.setBounds(200, 177, 100, 30);

			janela.setLayout(null);
			janela.setResizable(false);
			janela.setLocationRelativeTo(null);

			janela.add(titulo);
			janela.add(listaIngresso);
			janela.add(cadastroIngresso);
			janela.add(refreshFilme);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroIngresso.addActionListener(this);
			refreshFilme.addActionListener(this);
			listaIngresso.addListSelectionListener(this);

		}

	}

	@Override
	public void valueChanged(ListSelectionEvent acao) {
		Object src = acao.getSource();

		if (acao.getValueIsAdjusting() && src == listaMovie) {
			new TelaEdit().inserirEditar(4, dados, this, listaMovie.getSelectedIndex());
		}
		if (acao.getValueIsAdjusting() && src == listaEspectador) {
			new TelaEdit().inserirEditar(5, dados, this, listaEspectador.getSelectedIndex());
		}
		if (acao.getValueIsAdjusting() && src == listaIngresso) {
			new TelaEdit().inserirEditar(6, dados, this, listaIngresso.getSelectedIndex());
		}

	}

	@Override

	// Gatilho botões
	public void actionPerformed(ActionEvent acao) {
		Object gatilho = acao.getSource();

		// Gatilhos para a pagina filme -> Exibição, Cadastro e Edit

		if (gatilho == cadastroFilme) {
			new TelaEdit().inserirEditar(1, dados, this, 0);
		}

		if (gatilho == refreshFilme) {

			listaNomes = new ControleFilme(dados).getNomeFilme();
			listaMovie.updateUI();
		}

		// Gatilhos para a pagina espectador -> Exibição, Cadastro e Edit

		if (gatilho == cadastroEspectador) {
			new TelaEdit().inserirEditar(2, dados, this, 0);

		}
		if (gatilho == refreshEspectador) {
			listaNomes = new ControleEspectador(dados).getNome();
			listaEspectador.updateUI();
		}

		// Gatilhos para a pagina ingresso -> Exibição, Cadastro e Edit

		if (gatilho == cadastroIngresso) {
			new TelaEdit().inserirEditar(3, dados, this, 0);

			if (gatilho == refreshEspectador) {
				listaNomes = new ControleIngresso(dados).getNomeIngresso();
				listaIngresso.updateUI();
			}

		}

	}
}
