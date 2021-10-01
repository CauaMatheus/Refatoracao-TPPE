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
	private JList<String> lista;
	private String[] listaNomes = new String[100];
	private String[] listaFilme = new String[100];

	public void mostrarDados(ControleDados d, int esc) {
		dados = d;

		// Mostrar dados de filmes cadastrados (JList)

		switch (esc) {
		case 1:
			listaNomes = new ControleFilme(dados).getNomeFilme();
			lista = new JList<String>(listaNomes);

			janela = new JFrame("Filmes");
			titulo = new JLabel("Filmes Cadastrados");
			cadastroFilme = new JButton("Cadastrar");
			refreshFilme = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);

			lista.setBounds(20, 50, 350, 120);
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			lista.setVisibleRowCount(10);

			cadastroFilme.setBounds(70, 177, 100, 30);
			refreshFilme.setBounds(200, 177, 100, 30);

			janela.setLayout(null);
			janela.setResizable(false);
			janela.setLocationRelativeTo(null);

			janela.add(titulo);
			janela.add(lista);
			janela.add(cadastroFilme);
			janela.add(refreshFilme);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroFilme.addActionListener(this);
			refreshFilme.addActionListener(this);
			lista.addListSelectionListener(this);
			break;

		case 2:

			listaNomes = new ControleEspectador(dados).getNome();
			lista = new JList<String>(listaNomes);

			janela = new JFrame("Espectadores Cadastrados");
			titulo = new JLabel("Espectadores ");
			cadastroEspectador = new JButton("Cadastrar");
			refreshEspectador = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);

			lista.setBounds(20, 50, 350, 120);
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			lista.setVisibleRowCount(10);

			cadastroEspectador.setBounds(70, 177, 100, 30);
			refreshEspectador.setBounds(200, 177, 100, 30);

			janela.setLayout(null);
			janela.setResizable(false);
			janela.setLocationRelativeTo(null);

			janela.add(titulo);
			janela.add(lista);
			janela.add(cadastroEspectador);
			janela.add(refreshEspectador);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroEspectador.addActionListener(this);
			refreshEspectador.addActionListener(this);
			lista.addListSelectionListener(this);
			break;

		case 3:

			listaNomes = new ControleIngresso(dados).getNomeIngresso();
			listaFilme = new ControleIngresso(dados).getHoraFilme();

			lista = new JList<String>(listaNomes);
			janela = new JFrame("Ingressos Cadastrados");
			titulo = new JLabel("Ingressos");
			cadastroIngresso = new JButton("Novo");
			refreshFilme = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(125, 10, 250, 30);

			lista.setBounds(20, 50, 350, 120);
			lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			lista.setVisibleRowCount(10);

			cadastroIngresso.setBounds(70, 177, 100, 30);
			refreshFilme.setBounds(200, 177, 100, 30);

			janela.setLayout(null);
			janela.setResizable(false);
			janela.setLocationRelativeTo(null);

			janela.add(titulo);
			janela.add(lista);
			janela.add(cadastroIngresso);
			janela.add(refreshFilme);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroIngresso.addActionListener(this);
			refreshFilme.addActionListener(this);
			lista.addListSelectionListener(this);

		}

	}

	@Override
	public void valueChanged(ListSelectionEvent acao) {
		Object src = acao.getSource();

		if (acao.getValueIsAdjusting() && src == lista) {
			new TelaEdit().inserirEditar(3, dados, this, lista.getSelectedIndex());
		}

	}

	@Override
	public void actionPerformed(ActionEvent acao) {
		Object gatilho = acao.getSource();

		if (gatilho == cadastroFilme) {
			new TelaEdit().inserirEditar(1, dados, this, 0);

		}

	}
}
