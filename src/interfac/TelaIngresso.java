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

public class TelaIngresso implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroIngresso;
	private JButton refreshEspectador;
	private JButton refreshFilme;
	private static ControleDados dados;;
	private JList<String> listaEspectadoresCadastrados;

	public void mostrarDados(ControleDados d) {
		dados = d;
		listaEspectadoresCadastrados = new JList<String>();
		janela = new JFrame("Espectadores Cadastrados");
		titulo = new JLabel("Espectadores");
		cadastroIngresso = new JButton("Novo");
		refreshFilme = new JButton("Refresh");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(125, 10, 250, 30);

		listaEspectadoresCadastrados.setBounds(20, 50, 350, 120);
		listaEspectadoresCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaEspectadoresCadastrados.setVisibleRowCount(10);

		cadastroIngresso.setBounds(70, 177, 100, 30);
		refreshFilme.setBounds(200, 177, 100, 30);

		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);

		janela.add(titulo);
		janela.add(listaEspectadoresCadastrados);
		janela.add(cadastroIngresso);
		janela.add(refreshFilme);

		janela.setSize(400, 250);
		janela.setVisible(true);

		cadastroIngresso.addActionListener(this);
		refreshFilme.addActionListener(this);
		listaEspectadoresCadastrados.addListSelectionListener(this);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent acao) {
		// TODO Auto-generated method stub
		
		Object gatilho = acao.getSource();
		
		if (gatilho == cadastroIngresso) {
			new 
		}


	}

}
