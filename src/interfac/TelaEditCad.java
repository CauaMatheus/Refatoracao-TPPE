package interfac;
/**Tela de edição dos dados relacionados ao acompanhamento
 * @version 1.0
 * @author Pedro V.
 * @since Out 2021
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.ControleDados;

/**
 * @author pablo
 *
 */
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

	/** Cria as telas de edição e de cadastro de Acompanahmento 
	 * @author Pedro V.
	 * @param op  int - De acordo com a opção selecionada, a tela terá algumas
	 *            modificações
	 * @param d   ControleDado - Manipular os dados do array
	 * @param telaAcompanhamento   TelaAcompanhamento - Tela que mostra os dados de acompanhamento na jlist
	 * @param pos int - posição do dado em um array
	 */
	public void inserirEditar(int op, ControleDados d, TelaAcompanhamento telaAcompanhamento, int pos) {
		janela = new JFrame(windown);

		janela = new JFrame("Cadastrado Acompanhamentos ");

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

		botaoSalvar.setBounds(240, 160, 100, 30);
		this.janela.add(botaoSalvar);

		// Coloca botão excluir para edição acompanhamento

		if (op == 2) {
			botaoExcluir.setBounds(50, 160, 100, 30);
			this.janela.add(botaoExcluir);
		}

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);

		this.janela.setResizable(false);
		this.janela.setLocationRelativeTo(null);
		this.janela.setLayout(null);
		this.janela.setSize(400, 250);
		this.janela.setVisible(true);
		
	}

	@Override
	/**
	 * Método que executa uma ação de acordo com o evento escutado. Por aqui será realizado o cadastro, edição ou remoção dos dados
	 * @author Pedro V.
	 * @param acao ActionEvent - Ação escutada pelo ActionListener
	 */
	public void actionPerformed(ActionEvent e) {
		Object acao = e.getSource();

		if (acao == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1) {
	
					novoDado[0] = Integer.toString(dados.getQntAcompanhamentos());
	
					novoDado[1] = valorNome.getText();
					novoDado[2] = valorValor.getText();
					novoDado[3] = valorQnt.getText();
					novoDado[4] = valorTipo.getText();
	
					res = dados.inserirEditarAcompanhamento(novoDado); // Salvar dados
				} else {
	
					novoDado[0] = Integer.toString(posicao);
	
					novoDado[1] = valorNome.getText();
					novoDado[2] = valorValor.getText();
					novoDado[3] = valorQnt.getText();
					novoDado[4] = valorTipo.getText();
	
					res = dados.inserirEditarAcompanhamento(novoDado); // Salvar dados
	
				}
	
				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();
				
			}catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (acao == botaoExcluir) {
			boolean res = false;
			res = dados.removerAcompanhamento(posicao);
			if(res) {
				mensagemSucessoExclusao();
			}else {
				mensagemErroExclusao();
			}


		}
		

	}

	/**
	 * Exibe mensagem de sucesso quando o dado for devidamente Cadastrado
	 * 
	 * @author Pedro V.
	 */
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
		
	}

	/**
	 * Exibe mensagem de Erro quando o dado não for devidamente Cadastrado
	 * 
	 * @author Pedro V.
	 */
	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null, "ERRO AO SALVAR OS DADOS! ");
		
	}

	/**
	 * Exibe mensagem de Sucesso quando o dado for devidamente excluido
	 * 
	 * @author Pedro V.
	 */
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
		
	}
	
	/**
	 * Exibe mensagem de Erro quando o dado não for devidamente excluido
	 * 
	 * @author Pablo C. e Pedro V.
	 */
	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR OS DADOS! ");

	}

}
