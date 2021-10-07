package control;

import modelo.Filme;

public class ControleFilme {

	// Array para guardar filmes

	private Filme[] f;

	private int QntFilmes;

	public ControleFilme(ControleDados d) {
		f = d.getFilmes();
		QntFilmes = d.getQtdFilmes();
	}

	// Array de String que irá aparecer no Jlist

	public String[] getNomeFilme() {
		String[] s = new String[QntFilmes];
		for (int i = 0; i < QntFilmes; i++) {
			s[i] = f[i].getNomeFilme();
		}

		return s;
	}

	// Função de pesquisa

	public String[] getPesquisaFilme(String pesFilme) {
		String[] s = new String[QntFilmes];
		for (int i = 0; i < QntFilmes; i++) {
			if ((f[i].getNomeFilme()).contains(pesFilme)) {
				s[i] = f[i].getNomeFilme();
			}
		}
		return s;
	}

	public int getQtd() {
		return QntFilmes;
	}

	public void setQtd(int qtd) {
		this.QntFilmes = qtd;
	}

	public String getNome(int i) {
		return f[i].getNomeFilme();
	}

	public String getHora(int i) {
		return f[i].getHoraFilme();
	}

	public int getSala(int i) {
		return f[i].getNumSala();
	}

	public int getDuracao(int i) {
		return f[i].getDuracao();
	}

	public void setQtdFilme(int QntFilmes) {
		this.QntFilmes = QntFilmes;
	}

	public String gethoraFilme(int i) {
		return f[i].getHoraFilme();
	}

	public String getGenero(int i) {
		return f[i].getGenero();
	}

	public Double getValor(int i) {
		return f[i].getValor();
	}

	public int getFaixa(int i) {
		return f[i].getFaixaEtaria();
	}

	public String getDimensao(int i) {
		return f[i].getDimensao();
	}

	public String getAudio(int i) {
		return f[i].getAudio();
	}

	public int getEspCad(int i) {
		return f[i].getEspCad();
	}

}
