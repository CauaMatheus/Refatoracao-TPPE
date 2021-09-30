package control;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}

	public Filme[] getFilmes() {
		return this.d.getFilmes();
	}

	public int getQtdFilmes() {
		return this.getQtdFilmes();
	}

	public Ingresso[] getIngressos() {
		return this.d.getIngressos();
	}

	public int getQntIngressos() {
		return this.getQntIngressos();
	}

	public Espectador[] getEspectadores() {
		return this.d.getEspectadores();
	}

	public int getQntEspectadores() {
		return this.getQntEspectadores();
	}

	public Acompanhamento[] getAcompanhamentos() {
		return this.d.getAcompanhamentos();
	}

	public int getQntAcompanhamentos() {
		return this.getQntAcompanhamentos();
	}
	
	// Inserir e editar filme
	public boolean inserirEditarFilme(String[] dadosFilmes) {
		if(!dadosFilmes[3].matches("[0-9]+") || !dadosFilmes[4].matches("[0-9]+") || 
				!dadosFilmes[5].matches("[0-9]+") || !dadosFilmes[6].matches("[0-9]+")) {
			return false;
		} else {
				Filme f = new Filme(Integer.parseInt(dadosFilmes[1]), dadosFilmes[2], 
						dadosFilmes[3], Integer.parseInt(dadosFilmes[4]), dadosFilmes[5], Double.parseDouble(dadosFilmes[6]),
						Integer.parseInt(dadosFilmes[7]), dadosFilmes[8], dadosFilmes[9], Integer.parseInt(dadosFilmes[10]));
				d.inserirEditarFilme(f, Integer.parseInt(dadosFilmes[0]));
				return true;
		}
	}
	
	// remover filme

	/**
	public boolean removerProfessor(int i) {
		if(i == (d.getQtdFilmes() - 1)) { // O prof a ser removido está no final do array
			d.setQtdFilmes(d.getQtdFilmes() - 1);
			d.getFilmes()[d.getQtdFilmes()] = null;
			return true;
		} else { // o prof a ser removido está no meio do array
			int cont = 0;
			while(d.getFilmes()[cont].getNomeFilme().compareTo(filmeRemovido) != 0)
				cont++;
			//Rotina swap
			for(int j = cont; j < d.getQtdFilmes() - 1; j++) {
				d.getFilmes()[j] = null;
				d.getFilmes()[j] = d.getFilmes()[j+1];
			}
			d.getFilmes()[d.getQtdFilmes()] = null;
			d.setQtdFilmes(d.getQtdFilmes() - 1);
			return true;
		}
	**/
	
	/*
	 * public boolean inserirEditarFilme(String[] dadosProfs) {
	 * if(!dadosProfs[3].matches("[0-9]+") || !dadosProfs[4].matches("[0-9]+") ||
	 * !dadosProfs[5].matches("[0-9]+") || !dadosProfs[6].matches("[0-9]+")) {
	 * return false; } else { Professor p = new Professor(dadosProfs[1],
	 * Double.parseDouble(dadosProfs[2]), Integer.parseInt(dadosProfs[3]),
	 * Integer.parseInt(dadosProfs[4]), new
	 * Telefone(Integer.parseInt(dadosProfs[5]), Integer.parseInt(dadosProfs[6])));
	 * d.inserirEditaProf(p, Integer.parseInt(dadosProfs[0])); return true; }
	 * 
	 */

}