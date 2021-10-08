package interfac;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;

import control.ControleAcompanhamento;
import control.ControleDados;

public class TelaAcompanhamento {

	private JFrame janela;

	private static ControleDados dados;

	private JList<String> listaAcompanhamentos;
	private String[] listaNomes = new String[100];

	public void mostrarDados(ControleDados d) {
		dados = d;

		listaNomes = new ControleAcompanhamento(dados).getNome();
		listaAcompanhamentos = new JList<String>(listaNomes);

		janela = new JFrame("Acompanhamentos");
		JLabel titulo = new JLabel("Acompanhamentos Cadastrados");

		JButton cadastroIngresso = new JButton("Cadastrar");
		JButton refreshIngresso = new JButton("Refresh");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);

		listaAcompanhamentos.setBounds(20, 50, 350, 120);
		listaAcompanhamentos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaAcompanhamentos.setVisibleRowCount(10);

		cadastroIngresso.setBounds(70, 177, 100, 30);
		refreshIngresso.setBounds(200, 177, 100, 30);

		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);

		janela.add(titulo);
		janela.add(listaAcompanhamentos);
		janela.add(cadastroIngresso);
		janela.add(refreshIngresso);

		janela.setSize(400, 260);
		janela.setVisible(true);

	}

	// Captura de enventos
	public void valueChanged(ListSelectionEvent acao) {
		Object src = acao.getSource();

		// Consequência gatilhos
		if (acao.getValueIsAdjusting() && src == listaAcompanhamentos) {
			new TelaEdit().inserirEditar(8, dados, this, listaAcompanhamentos.getSelectedIndex());
		}

	}

}
