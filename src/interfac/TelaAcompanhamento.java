package interfac;

/**Tela de que irá mostrar os dados cadastrados no jlist, dar refresh e estabelecer pesquisador dos acompanhamentos
 * @version 1.0
 * @author Pedro V.
 * @since Out 2021
 */

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

import control.ControleAcompanhamento;
import control.ControleDados;

public class TelaAcompanhamento implements ActionListener, ListSelectionListener {

	private JFrame janela;

	private JButton cadastroAcompanhamento;
	private JButton refreshAcompanhamento;

	private static ControleDados dados;

	private JList<String> listaAcompanhamentos;
	private String[] listaNomes = new String[100];

	public void mostrarDados(ControleDados d) {
		dados = d;

		listaNomes = new ControleAcompanhamento(dados).getNome();
		listaAcompanhamentos = new JList<String>(listaNomes);

		janela = new JFrame("Acompanhamentos Cadastrados");
		JLabel titulo = new JLabel("Acompanhamentos ");

		cadastroAcompanhamento = new JButton("Cadastrar");
		refreshAcompanhamento = new JButton("Refresh");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);

		listaAcompanhamentos.setBounds(20, 50, 350, 120);
		listaAcompanhamentos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaAcompanhamentos.setVisibleRowCount(10);

		cadastroAcompanhamento.setBounds(70, 177, 100, 30);
		refreshAcompanhamento.setBounds(200, 177, 100, 30);

		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);

		janela.add(titulo);
		janela.add(listaAcompanhamentos);
		janela.add(cadastroAcompanhamento);
		janela.add(refreshAcompanhamento);

		janela.setSize(400, 260);
		janela.setVisible(true);
		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);

		cadastroAcompanhamento.addActionListener(this);
		refreshAcompanhamento.addActionListener(this);
		listaAcompanhamentos.addListSelectionListener(this);
		
		/**
		 * Cria a tela pra mostrar os dados de acompanhamento no jlist com botões e o pesquisador
		 * @author Pedro V.
		 * @param d   ControleDado - Manipular os dados do array
		 * @return mostrar os dados setada
		 */
	}

	// Captura de enventos
	@Override
	public void valueChanged(ListSelectionEvent acao) {
		Object src = acao.getSource();

		// Consequência gatilho lista
		if (acao.getValueIsAdjusting() && src == listaAcompanhamentos) {
			new TelaEditCad().inserirEditar(2, dados, this, listaAcompanhamentos.getSelectedIndex());
		}
		
		/**
		 * Método que executa uma açãp de acordo com o evento escutado em um elemento do jlist selecionado
		 * @author Pedro V.
		 * @param acao ActionSelectionEvent - Ação escutada pelo ListSelectionListener
		 */

	}

	// Gatilho botões

	@Override
	public void actionPerformed(ActionEvent acao) {
		Object gatilho = acao.getSource();

		if (gatilho == cadastroAcompanhamento) {
			new TelaEditCad().inserirEditar(1, dados, this, 0);

		}
		if (gatilho == refreshAcompanhamento) {

			listaAcompanhamentos.setListData(new ControleAcompanhamento(dados).getNome());
			listaAcompanhamentos.updateUI();
			
			/**
			 * Método que executa uma ação de acordo com o evento escutado. Por aqui será feita a ação de cadastro e atualização do jlist pelo refresh
			 * @author Pedro V.
			 * @param acao ActionEvent - Ação escutada pelo ActionListener
			 */
		}

	}
}
