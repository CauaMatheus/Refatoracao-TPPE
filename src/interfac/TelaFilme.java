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

public class TelaFilme implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroFilme;
	private JButton refreshFilme;
	/*
	 * private JButton cadastroProf; private JButton refreshProf;
	 */
	private static ControleDados dados;
	private JList<String> listaFilmesCadastrados;
	// private JList<String> listaProfsCadastrados;
	// private String[] listaNomes = new String[100];

	public void mostrarDados(ControleDados d) {
		dados = d;

		// Mostrar dados de filmes cadastrados (JList)
		// listaNomes = new ControleFilme(dados).getNomeFilme();
		listaFilmesCadastrados = new JList<String>();
		janela = new JFrame("Filmes");
		titulo = new JLabel("Filmes Cadastrados");
		cadastroFilme = new JButton("Cadastrar");
		refreshFilme = new JButton("Refresh");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);

		listaFilmesCadastrados.setBounds(20, 50, 350, 120);
		listaFilmesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaFilmesCadastrados.setVisibleRowCount(10);

		cadastroFilme.setBounds(70, 177, 100, 30);
		refreshFilme.setBounds(200, 177, 100, 30);

		janela.setLayout(null);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);

		janela.add(titulo);
		janela.add(listaFilmesCadastrados);
		janela.add(cadastroFilme);
		janela.add(refreshFilme);

		janela.setSize(400, 250);
		janela.setVisible(true);

		cadastroFilme.addActionListener(this);
		refreshFilme.addActionListener(this);
		listaFilmesCadastrados.addListSelectionListener(this);

		/*
		 * case 2:// Mostrar dados de professores cadastrados (JList) listaNomes = new
		 * ControleProfessor(dados).getNomeProf(); listaProfsCadastrados = new
		 * JList<String>(listaNomes); janela = new JFrame("Professores"); titulo = new
		 * JLabel("Professores Cadastrados"); cadastroProf = new JButton("Cadastrar");
		 * refreshProf = new JButton("Refresh");
		 * 
		 * titulo.setFont(new Font("Arial", Font.BOLD, 20)); titulo.setBounds(90, 10,
		 * 250, 30); listaProfsCadastrados.setBounds(20, 50, 350, 120);
		 * listaProfsCadastrados.setSelectionMode(ListSelectionModel.
		 * SINGLE_INTERVAL_SELECTION); listaProfsCadastrados.setVisibleRowCount(10);
		 * 
		 * 
		 * cadastroProf.setBounds(70, 177, 100, 30); refreshProf.setBounds(200, 177,
		 * 100, 30);
		 * 
		 * janela.setLayout(null);
		 * 
		 * janela.add(titulo); janela.add(listaProfsCadastrados);
		 * janela.add(cadastroProf); janela.add(refreshProf);
		 * 
		 * janela.setSize(400, 250); janela.setVisible(true);
		 * 
		 * cadastroProf.addActionListener(this); refreshProf.addActionListener(this);
		 * listaProfsCadastrados.addListSelectionListener(this); break;
		 * 
		 * default: JOptionPane.showMessageDialog(null,"Opção não encontrada!", null,
		 * JOptionPane.ERROR_MESSAGE); }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * //Captura eventos relacionados aos botões da interface
		 * 
		 * public void actionPerformed(ActionEvent e) { Object src = e.getSource();
		 * 
		 * //Cadastro de novo aluno if(src == cadastroAluno) new
		 * TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
		 * 
		 * //Cadastro de novo professor if(src == cadastroProf) new
		 * TelaDetalhePessoa().inserirEditar(2, dados, this, 0);
		 * 
		 * // Atualiza a lista de nomes de alunos mostrada no JList if(src ==
		 * refreshFilme) { listaAlunosCadastrados.setListData(new
		 * ControleAluno(dados).getNomeAluno()); listaAlunosCadastrados.updateUI(); }
		 * 
		 * // Atualiza a lista de nomes de professores mostrada no JList if(src ==
		 * refreshProf) { listaProfsCadastrados.setListData(new
		 * ControleProfessor(dados).getNomeProf()); listaProfsCadastrados.updateUI(); }
		 * 
		 * }
		 * 
		 * //Captura eventos relacionados ao JList public void
		 * valueChanged(ListSelectionEvent e) { Object src = e.getSource();
		 * 
		 * if(e.getValueIsAdjusting() && src == listaAlunosCadastrados) { new
		 * TelaDetalhePessoa().inserirEditar(3, dados, this,
		 * listaAlunosCadastrados.getSelectedIndex()); }
		 * 
		 * if(e.getValueIsAdjusting() && src == listaProfsCadastrados) { new
		 * TelaDetalhePessoa().inserirEditar(4, dados, this,
		 * listaProfsCadastrados.getSelectedIndex()); } }
		 */

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
