package interfac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ControleDados;

public class TelaEditCad implements ActionListener {

	private JLabel labelNome = new JLabel("Quantidade: ");
	private JTextField valorNome;
	private JLabel labelValor = new JLabel("Tipo: ");
	private JTextField valorValor;
	private JLabel labelQnt = new JLabel("Quantidade: ");
	private JTextField valorQnt;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;

	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");

	private String[] novoDado = new String[12];

	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String windown;

	public void inserirEditar(int op, ControleDados dados, TelaAcompanhamento telaAcompanhamento, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 7) {
			windown = "Cadastro Acompanhamento";
		}
		if (op == 8) {
			windown = "Edição Acompanhamento";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
