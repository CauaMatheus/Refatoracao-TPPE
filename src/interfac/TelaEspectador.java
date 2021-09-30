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

public class TelaEspectador implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroEspectador;
	private JButton refreshEspectador;
	private JButton refreshFilme;
	private static ControleDados dados;
	private JList<String> listaEspectadoresCadastrados;
	private String[] listaEspectadores = new String[100];

	public void mostrarDados(ControleDados d) {
		dados = d;
		listaEspectadoresCadastrados = new JList<String>(listaEspectadores);
		janela = new JFrame("Espectadores");
		titulo = new JLabel("Espectadores Cadastrados");
		cadastroEspectador = new JButton("Cadastrar");
		refreshFilme = new JButton("Refresh");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);

		listaEspectadoresCadastrados.setBounds(20, 50, 350, 120);
		listaEspectadoresCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaEspectadoresCadastrados.setVisibleRowCount(10);

		cadastroEspectador.setBounds(70, 177, 100, 30);
		refreshFilme.setBounds(200, 177, 100, 30);

		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);

		janela.add(titulo);
		janela.add(listaEspectadoresCadastrados);
		janela.add(cadastroEspectador);
		janela.add(refreshFilme);

		janela.setSize(400, 250);
		janela.setVisible(true);

		cadastroEspectador.addActionListener(this);
		refreshFilme.addActionListener(this);
		listaEspectadoresCadastrados.addListSelectionListener(this);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
