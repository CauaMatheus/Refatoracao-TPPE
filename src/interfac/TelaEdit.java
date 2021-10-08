package interfac;

/**Tela de edição, cadastro e remoção de dados
 * @version 1.0
 * @author Pablo C. e Pedro V.
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

public class TelaEdit implements ActionListener {

	// Implementando Janelas e propriedades

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelSala = new JLabel("Sala: ");
	private JTextField valorSala;
	private JLabel labelHora = new JLabel("Hora: ");
	private JTextField valorHora;
	private JLabel labelDura = new JLabel("Duração: ");
	private JTextField valorDura;
	private JLabel labelGenero = new JLabel("Genero");
	private JTextField valorGenero;
	private JLabel Labelvalor = new JLabel("valor: ");
	private JTextField valorValor;
	private JLabel labelFaixa = new JLabel("Faixa Etaria: ");
	private JTextField valorFaixa;
	private JLabel labelDim = new JLabel("Dimensão: ");
	private JTextField valorDim;
	private JLabel labelAudio = new JLabel("Audio: ");
	private JTextField valorAudio;
	private JLabel labelEspCad = new JLabel("Espectadores: ");
	private JTextField valorEspCad;
	private JLabel labelNascimento = new JLabel("Nasc: ");
	private JTextField valorNascimento;
	private JLabel LabelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelNomeEsp = new JLabel("Espectador: ");
	private JTextField valorNomeEsp;
	private JLabel LabelEntrada = new JLabel("Entrada: ");
	private JTextField valorEntrada;
	private JLabel LabelID = new JLabel("ID: ");
	private JTextField valorID;

	// Botões
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");

	private String[] novoDado = new String[12];

	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String windown;

	public void inserirEditar(int op, ControleDados d, TelaFilme p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			windown = "Cadastro Filme";
		if (op == 2)
			windown = "Cadastro Espectador";
		if (op == 3)
			windown = "Cadastro Ingresso";

		if (op == 4)
			windown = "Edição Filme";
		if (op == 5)
			windown = "Edição Espectador";
		if (op == 6)
			windown = "Edição Ingresso";

		if (op == 7) {
			windown = "Cadastro Acompanhamento";
		}
		if (op == 8) {
			windown = "Edição Acompanhamento";
		}

		janela = new JFrame(windown);

		if (op == 4 || op == 1) {

			if (op == 4) {
				// Criando FIlD com dados do Filme clicado

				valorNome = new JTextField(dados.getFilmes()[pos].getNomeFilme(), 200);
				valorSala = new JTextField(String.valueOf(dados.getFilmes()[pos].getNumSala()), 200);
				valorHora = new JTextField(dados.getFilmes()[pos].getHoraFilme(), 200);
				valorDura = new JTextField(String.valueOf(dados.getFilmes()[pos].getDuracao()), 200);
				valorGenero = new JTextField(dados.getFilmes()[pos].getGenero(), 200);
				valorValor = new JTextField(String.valueOf(dados.getFilmes()[pos].getValor()), 200);
				valorFaixa = new JTextField(String.valueOf(dados.getFilmes()[pos].getFaixaEtaria()), 200);
				valorDim = new JTextField(dados.getFilmes()[pos].getDimensao(), 200);
				valorAudio = new JTextField(dados.getFilmes()[pos].getAudio(), 200);
				valorEspCad = new JTextField(String.valueOf(dados.getFilmes()[pos].getEspCad()), 200);
				valorNascimento = new JTextField(200);
				valorCPF = new JTextField(200);
				valorID = new JTextField(200);
				valorEntrada = new JTextField(200);
			} else {
				// Criando FIELD para filme sem preencher com os dados

				valorNome = new JTextField(200);
				valorSala = new JTextField(200);
				valorHora = new JTextField(200);
				valorDura = new JTextField(200);
				valorGenero = new JTextField(200);
				valorValor = new JTextField(200);
				valorFaixa = new JTextField(200);
				valorDim = new JTextField(200);
				valorAudio = new JTextField(200);
				valorEspCad = new JTextField(200);
				valorNascimento = new JTextField(200);
				valorCPF = new JTextField(200);
				valorID = new JTextField(200);
				valorEntrada = new JTextField(200);
			}

			// Configuração pagina
			labelNome.setBounds(30, 20, 100, 25);
			valorNome.setBounds(136, 20, 200, 25);
			labelSala.setBounds(30, 50, 100, 25);
			valorSala.setBounds(136, 50, 200, 25);
			labelHora.setBounds(30, 80, 100, 25);
			valorHora.setBounds(136, 80, 200, 25);
			labelDura.setBounds(30, 110, 100, 25);
			valorDura.setBounds(136, 110, 200, 25);
			labelGenero.setBounds(30, 140, 100, 25);
			valorGenero.setBounds(136, 140, 200, 25);
			Labelvalor.setBounds(30, 170, 100, 25);
			valorValor.setBounds(136, 170, 200, 25);
			labelFaixa.setBounds(30, 200, 100, 25);
			valorFaixa.setBounds(136, 200, 200, 25);
			labelDim.setBounds(30, 230, 100, 25);
			valorDim.setBounds(136, 230, 200, 25);
			labelAudio.setBounds(30, 260, 100, 25);
			valorAudio.setBounds(136, 260, 200, 25);
			labelEspCad.setBounds(30, 290, 100, 25);
			valorEspCad.setBounds(136, 290, 200, 25);

			// Inserindo configurações na pagina

			this.janela.add(labelNome);
			this.janela.add(valorNome);
			this.janela.add(labelSala);
			this.janela.add(valorSala);
			this.janela.add(labelHora);
			this.janela.add(valorHora);
			this.janela.add(labelDura);
			this.janela.add(valorDura);
			this.janela.add(labelGenero);
			this.janela.add(valorGenero);

			this.janela.add(Labelvalor);
			this.janela.add(valorValor);
			this.janela.add(labelFaixa);
			this.janela.add(valorFaixa);
			this.janela.add(labelDim);
			this.janela.add(valorDim);
			this.janela.add(labelAudio);
			this.janela.add(valorAudio);
			this.janela.add(labelEspCad);
			this.janela.add(valorEspCad);

			this.janela.setLayout(null);
			this.janela.setSize(400, 430);
		}

		// Preenche dados com dados do Epectador clicado

		else if (op == 5 || op == 2) {

			if (op == 5) {
				// Criando FIElD com dados do Espectador clicado

				valorNomeEsp = new JTextField(dados.getEspectadores()[pos].getNome(), 200);
				valorNascimento = new JTextField(dados.getEspectadores()[pos].getNasc(), 200);
				valorCPF = new JTextField(dados.getEspectadores()[pos].getCpf(), 200);

				valorNome = new JTextField(200);
				valorSala = new JTextField(200);
				valorHora = new JTextField(200);
				valorID = new JTextField(200);
				valorEntrada = new JTextField(200);

				valorDura = new JTextField(200);
				valorGenero = new JTextField(200);
				valorValor = new JTextField(200);
				valorFaixa = new JTextField(200);
				valorDim = new JTextField(200);
				valorAudio = new JTextField(200);
				valorEspCad = new JTextField(200);

			} else {
				// Criando FIELD para Ingresso sem preencher com os dados

				valorNomeEsp = new JTextField(200);
				valorNascimento = new JTextField(200);
				valorCPF = new JTextField(200);

				valorNome = new JTextField(200);
				valorSala = new JTextField(200);
				valorHora = new JTextField(200);
				valorID = new JTextField(200);
				valorEntrada = new JTextField(200);

				valorDura = new JTextField(200);
				valorGenero = new JTextField(200);
				valorValor = new JTextField(200);
				valorFaixa = new JTextField(200);
				valorDim = new JTextField(200);
				valorAudio = new JTextField(200);
				valorEspCad = new JTextField(200);

			}

			// Configuração pagina
			labelNomeEsp.setBounds(30, 20, 100, 25);
			valorNomeEsp.setBounds(136, 20, 200, 25);
			labelNascimento.setBounds(30, 50, 100, 25);
			valorNascimento.setBounds(136, 50, 200, 25);
			LabelCPF.setBounds(30, 80, 100, 25);
			valorCPF.setBounds(136, 80, 200, 25);

			// Inserindo dados
			this.janela.add(labelNomeEsp);
			this.janela.add(valorNomeEsp);
			this.janela.add(labelNascimento);
			this.janela.add(valorNascimento);
			this.janela.add(LabelCPF);
			this.janela.add(valorCPF);

			this.janela.setLayout(null);
			this.janela.setSize(400, 200);

		} else if (op == 6 || op == 3) {

			if (op == 6) {
				// Preenche dados com dados do Ingresso clicado
				valorNomeEsp = new JTextField(String.valueOf(dados.getIngressos()[pos].getNomeEsp()), 200);
				valorNome = new JTextField(dados.getIngressos()[pos].getNomeFilme(), 200);
				valorSala = new JTextField(String.valueOf(dados.getIngressos()[pos].getNumSala()), 200);
				valorHora = new JTextField(dados.getIngressos()[pos].getHoraFilme(), 200);
				valorID = new JTextField(String.valueOf(dados.getIngressos()[pos].getId()), 200);
				valorEntrada = new JTextField(dados.getIngressos()[pos].getTipoEntrada(), 200);

				valorDura = new JTextField(200);
				valorGenero = new JTextField(200);
				valorValor = new JTextField(200);
				valorFaixa = new JTextField(200);
				valorDim = new JTextField(200);
				valorAudio = new JTextField(200);
				valorEspCad = new JTextField(200);
				valorNascimento = new JTextField(200);
				valorCPF = new JTextField(200);
			} else {

				// Criando FIELD para Ingresso sem preencher com os dados
				valorNomeEsp = new JTextField(200);
				valorNome = new JTextField(200);
				valorSala = new JTextField(200);
				valorHora = new JTextField(200);
				valorID = new JTextField(200);
				valorEntrada = new JTextField(200);

				valorDura = new JTextField(200);
				valorGenero = new JTextField(200);
				valorValor = new JTextField(200);
				valorFaixa = new JTextField(200);
				valorDim = new JTextField(200);
				valorAudio = new JTextField(200);
				valorEspCad = new JTextField(200);
				valorNascimento = new JTextField(200);
				valorCPF = new JTextField(200);
			}

			// Configuração pagina
			labelNomeEsp.setBounds(30, 20, 100, 25);
			valorNomeEsp.setBounds(136, 20, 200, 25);
			labelNome.setBounds(30, 50, 100, 25);
			valorNome.setBounds(136, 50, 200, 25);
			labelSala.setBounds(30, 80, 100, 25);
			valorSala.setBounds(136, 80, 200, 25);
			labelHora.setBounds(30, 110, 100, 25);
			valorHora.setBounds(136, 110, 200, 25);
			LabelID.setBounds(30, 140, 100, 25);
			valorID.setBounds(136, 140, 200, 25);
			LabelEntrada.setBounds(30, 170, 100, 25);
			valorEntrada.setBounds(136, 170, 200, 25);

			// Inserindo Dados

			this.janela.add(labelNomeEsp);
			this.janela.add(labelNome);
			this.janela.add(labelSala);
			this.janela.add(labelHora);
			this.janela.add(LabelID);
			this.janela.add(LabelEntrada);

			this.janela.add(valorNomeEsp);
			this.janela.add(valorNome);
			this.janela.add(valorSala);
			this.janela.add(valorHora);
			this.janela.add(valorID);
			this.janela.add(valorEntrada);

			this.janela.setLayout(null);
			this.janela.setSize(400, 300);
		}

		// Botão de salvar para cadastro filmes e edição filme
		if (op == 4 || op == 1) {

			botaoSalvar.setBounds(220, 340, 115, 30);
			this.janela.add(botaoSalvar);

			// Botão de excluir para Editar Filme
			if (op == 4) {
				botaoExcluir.setBounds(50, 340, 115, 30);
				this.janela.add(botaoExcluir);
			}

			// Botão de salvar para cadastro Espectador e edição Espectador
		} else if (op == 5 || op == 2) {

			botaoSalvar.setBounds(220, 110, 115, 30);
			this.janela.add(botaoSalvar);

			// Coloca botão excluir para edição Espectador
			if (op == 5) {
				botaoExcluir.setBounds(50, 110, 115, 30);
				this.janela.add(botaoExcluir);

				// Botão salvar para cadastro de ingresso e edição de ingresso
			}

		} else if (op == 6 || op == 3) {

			botaoSalvar.setBounds(220, 210, 115, 30);
			this.janela.add(botaoSalvar);

			// Coloca botão excluir para edição Espectador
			if (op == 6) {
				botaoExcluir.setBounds(50, 210, 115, 30);
				this.janela.add(botaoExcluir);

			}
		}

		// Definindo Propriedades na janela

		this.janela.setResizable(false);
		this.janela.setLocationRelativeTo(null);
		this.janela.setVisible(true);

		// Atribuindo Escuta a interação dos botões
		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);

		/**
		 * Cria a tela de Edit adicionando elementos e editando os mesmos,
		 * 
		 * @author Pedro V.
		 * @param op  int - De acordo com a opção selecionada, a tela terá algumas
		 *            modificações
		 * @param d   ControleDado - Manipular os dados do array
		 * @param P   TelaFilme -
		 * @param pos int - posição do dado em um array
		 * @return tela de edit setada
		 */

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			boolean res;
			res = true;
			if (opcao == 1) { // cadastro de novo Filme
				novoDado[0] = Integer.toString(dados.getQtdFilmes());

				novoDado[1] = valorSala.getText();
				novoDado[2] = valorNome.getText();
				novoDado[3] = valorHora.getText();
				novoDado[4] = valorDura.getText();
				novoDado[5] = valorGenero.getText();
				novoDado[6] = valorValor.getText();
				novoDado[7] = valorFaixa.getText();
				novoDado[8] = valorDim.getText();
				novoDado[9] = valorAudio.getText();
				novoDado[10] = valorEspCad.getText();

			} else if (opcao == 2) { // cadastro de novo Espectador
				novoDado[0] = Integer.toString(dados.getQntEspectadores());

				novoDado[1] = valorNomeEsp.getText();
				novoDado[2] = valorNascimento.getText();
				novoDado[3] = valorCPF.getText();

			} else if (opcao == 3) {// cadastro de novo Ingresso
				novoDado[0] = Integer.toString(dados.getQntIngressos());

				novoDado[1] = valorNomeEsp.getText();
				novoDado[2] = valorNome.getText();
				novoDado[3] = valorSala.getText();
				novoDado[4] = valorHora.getText();
				novoDado[5] = valorID.getText();
				novoDado[6] = valorEntrada.getText();

			} else if (opcao == 4) {

				novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorSala.getText();
				novoDado[2] = valorNome.getText();
				novoDado[3] = valorHora.getText();
				novoDado[4] = valorDura.getText();
				novoDado[5] = valorGenero.getText();
				novoDado[6] = valorValor.getText();
				novoDado[7] = valorFaixa.getText();
				novoDado[8] = valorDim.getText();
				novoDado[9] = valorAudio.getText();
				novoDado[10] = valorEspCad.getText();

			} else if (opcao == 5) {// edicao de dado existente Espectador
				novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNomeEsp.getText();
				novoDado[2] = valorNascimento.getText();
				novoDado[3] = valorCPF.getText();

				res = dados.inserirEditarEspectador(novoDado); // Salvar dados

			} else {// edicao de dado existente Ingresso
				novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNomeEsp.getText();
				novoDado[2] = valorNome.getText();
				novoDado[3] = valorHora.getText();
				novoDado[4] = valorEntrada.getText();
				novoDado[5] = valorID.getText();
				novoDado[6] = valorSala.getText();

				res = dados.inserirEditarIngresso(novoDado); // Salvar dados
			}

			if (opcao == 1 || opcao == 4) {
				res = dados.inserirEditarFilme(novoDado);

			} else if (opcao == 2 || opcao == 5) {
				res = dados.inserirEditarEspectador(novoDado);

			} else if (opcao == 3 || opcao == 6) {
				res = dados.inserirEditarIngresso(novoDado);

			}

			// Se Res receber true, retorna uma mensagem de sucesso, se nn retorna uma
			// mesnagem de erro
			if (res) {
				mensagemSucessoCadastro();
			} else
				mensagemErroCadastro();

		}
		/*
		 * catch (NullPointerException exc1) { mensagemErroCadastro();
		 */
		/*
		 * catch (NumberFormatException exc2) { mensagemErroCadastro(); }
		 */

		if (src == botaoExcluir) {

			if (opcao == 4) {// exclui Filme
				dados.removerFilme(posicao);
				mensagemSucessoExclusao();
			}

			if (opcao == 5) { // exclui Espectador
				dados.removerEspectador(posicao);
				mensagemSucessoExclusao();

			}

			if (opcao == 6) { // exclui Ingresso
				dados.removerIngresso(posicao);
				mensagemSucessoExclusao();

			}

		}

		/**
		 * Método que executa uma açãp de acordo com o evento escutado. Por aqui será
		 * realizado o cadastro, ediçõa ou remoção dos dados
		 * 
		 * @author Pablo C.
		 * @param acao ActionEvent - Ação escutada pelo ActionListener
		 */
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();

		/**
		 * Exibe mensagem de sucesso quando o dado for devidamente excluido
		 * 
		 * @author Pablo C. e Pedro V.
		 */
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();

		/**
		 * Exibe mensagem de sucesso quando o dado for devidamente cadastrado
		 * 
		 * @author Pablo C. e Pedro V.
		 */
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null, "ERRO AO SALVAR OS DADOS! ");

		/**
		 * Exibe mensagem de Erro quando o dado não for devidamente cadastrado
		 * 
		 * @author Pablo C. e Pedro V.
		 */
	}

	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR OS DADOS! ");

		/**
		 * Exibe mensagem de Erro quando o dado não for devidamente excluido
		 * 
		 * @author Pablo C. e Pedro V.
		 */
	}

}
