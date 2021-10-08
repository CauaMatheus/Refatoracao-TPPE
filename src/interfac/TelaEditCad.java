package interfac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.ControleDados;

public class TelaEditCad implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelValor = new JLabel("Valor: ");
	private JTextField valorValor;
	private JLabel labelQnt = new JLabel("Quantidade: ");
	private JTextField valorQnt;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;

	// botões
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");

	// Vetor para novos dados
	private String[] novoDado = new String[6];

	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String windown;

	public void inserirEditar(int op, ControleDados d, TelaAcompanhamento telaAcompanhamento, int pos) {
		janela = new JFrame(windown);

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) {
			windown = "Cadastro Acompanhamento";

			valorNome = new JTextField();
			valorValor = new JTextField();
			valorQnt = new JTextField();
			valorTipo = new JTextField();

		}
		if (op == 2) {
			windown = "Edição Acompanhamento";

			valorNome = new JTextField(dados.getAcompanhamentos()[pos].getNome(), 200);
			valorValor = new JTextField(String.valueOf(dados.getAcompanhamentos()[pos].getValor()), 200);
			valorQnt = new JTextField(String.valueOf(dados.getAcompanhamentos()[pos].getQnt()), 200);
			valorTipo = new JTextField(dados.getAcompanhamentos()[pos].getTipo(), 200);

		}

		// Configuração pagina

		labelNome.setBounds(30, 20, 100, 25);
		valorNome.setBounds(136, 20, 200, 25);

		labelValor.setBounds(30, 50, 100, 25);
		valorValor.setBounds(136, 50, 200, 25);

		labelQnt.setBounds(30, 80, 100, 25);
		valorQnt.setBounds(136, 80, 200, 25);

		labelTipo.setBounds(30, 110, 100, 25);
		valorTipo.setBounds(136, 110, 200, 25);

		// Inserindo elementos na página

		this.janela.add(labelNome);
		this.janela.add(valorNome);

		this.janela.add(labelValor);
		this.janela.add(valorValor);

		this.janela.add(labelQnt);
		this.janela.add(valorQnt);

		this.janela.add(labelTipo);
		this.janela.add(valorTipo);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
