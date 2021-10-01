package control;

import modelo.Acompanhamento;
import modelo.Dados;
import modelo.Espectador;
import modelo.Filme;
import modelo.Ingresso;

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
		return this.d.getQtdFilmes();
	}

	public Ingresso[] getIngressos() {
		return this.d.getIngressos();
	}

	public int getQntIngressos() {
		return this.d.getQtdIngressos();
	}

	public Espectador[] getEspectadores() {
		return this.d.getEspectadores();
	}

	public int getQntEspectadores() {
		return this.d.getQtdEspectadores();
	}

	public Acompanhamento[] getAcompanhamentos() {
		return this.d.getAcompanhamentos();
	}

	public int getQntAcompanhamentos() {
		return this.d.getQtdAcompanhamentos();
	}

	// Inserir e editar filme
	public boolean inserirEditarFilme(String[] dadosFilmes) {
		if (!dadosFilmes[1].matches("[0-9]+") || !dadosFilmes[2].matches("[0-9]+") || !dadosFilmes[3].matches("[0-9]+")
				|| !dadosFilmes[4].matches("[0-9]+") || !dadosFilmes[5].matches("[0-9]+")
				|| !dadosFilmes[6].matches("[0-9]+") || !dadosFilmes[7].matches("[0-9]+")
				|| !dadosFilmes[8].matches("[0-9]+") || !dadosFilmes[9].matches("[0-9]+")
				|| !dadosFilmes[10].matches("[0-9]+")) {
			return false;
		} else {
			Filme f = new Filme(Integer.parseInt(dadosFilmes[1]), dadosFilmes[2], dadosFilmes[3],
					Integer.parseInt(dadosFilmes[4]), dadosFilmes[5], Double.parseDouble(dadosFilmes[6]),
					Integer.parseInt(dadosFilmes[7]), dadosFilmes[8], dadosFilmes[9],
					Integer.parseInt(dadosFilmes[10]));
			d.inserirEditarFilme(f, Integer.parseInt(dadosFilmes[0]));
			return true;
		}
	}

	// remover Filme
	public boolean removerFilme(int i) {
		String filmeRemovido = d.getFilmes()[i].getNomeFilme();

		if (i == (d.getQtdFilmes() - 1)) { // O prof a ser removido está no final do array
			d.setQtdFilmes(d.getQtdFilmes() - 1);
			d.getFilmes()[d.getQtdFilmes()] = null;
			return true;

		} else { // o prof a ser removido está no meio do array
			int cont = 0;
			while (d.getFilmes()[cont].getNomeFilme().compareTo(filmeRemovido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdFilmes() - 1; j++) {
				d.getFilmes()[j] = null;
				d.getFilmes()[j] = d.getFilmes()[j + 1];
			}
			d.getFilmes()[d.getQtdFilmes()] = null;
			d.setQtdFilmes(d.getQtdFilmes() - 1);
			return true;
		}
	}

	// Inserir e editar Ingresso
	public boolean inserirEditarIngresso(String[] dadosIngressos) {
		if (!dadosIngressos[1].matches("[0-9]+") || !dadosIngressos[2].matches("[0-9]+")
				|| !dadosIngressos[3].matches("[0-9]+") || !dadosIngressos[4].matches("[0-9]+")) {
			return false;
		} else {
			Ingresso in = new Ingresso(Integer.parseInt(dadosIngressos[1]), dadosIngressos[2], dadosIngressos[3],
					dadosIngressos[4], Integer.parseInt(dadosIngressos[5]));
			d.inserirEditarIngresso(in, Integer.parseInt(dadosIngressos[0]));
			return true;
		}
	}

	// remover Ingresso
	public boolean removerIngresso(int i) {
		String inRemovido = d.getIngressos()[i].getNomeFilme();

		if (i == (d.getQtdIngressos() - 1)) { // O prof a ser removido está no final do array
			d.setQtdIngressos(d.getQtdIngressos() - 1);
			d.getIngressos()[d.getQtdIngressos()] = null;
			return true;

		} else { // o prof a ser removido está no meio do array
			int cont = 0;
			while (d.getIngressos()[cont].getNomeFilme().compareTo(inRemovido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdIngressos() - 1; j++) {
				d.getIngressos()[j] = null;
				d.getIngressos()[j] = d.getIngressos()[j + 1];
			}
			d.getIngressos()[d.getQtdIngressos()] = null;
			d.setQtdIngressos(d.getQtdIngressos() - 1);
			return true;
		}
	}

	// Inserir e editar Ingresso
	public boolean inserirEditarEspectador(String[] dadosEspectadores) {
		if (!dadosEspectadores[1].matches("[0-9]+") || !dadosEspectadores[2].matches("[0-9]+")
				|| !dadosEspectadores[3].matches("[0-9]+")) {
			return false;
		} else {
			Espectador e = new Espectador(dadosEspectadores[1], dadosEspectadores[2], dadosEspectadores[3]);
			d.inserirEditarEspectador(e, Integer.parseInt(dadosEspectadores[0]));
			return true;
		}
	}

	// remover Ingresso
	public boolean removerIngresso(int i) {
		String inRemovido = d.getIngressos()[i].getNomeFilme();

		if (i == (d.getQtdIngressos() - 1)) { // O prof a ser removido está no final do array
			d.setQtdIngressos(d.getQtdIngressos() - 1);
			d.getIngressos()[d.getQtdIngressos()] = null;
			return true;

		} else { // o prof a ser removido está no meio do array
			int cont = 0;
			while (d.getIngressos()[cont].getNomeFilme().compareTo(inRemovido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdIngressos() - 1; j++) {
				d.getIngressos()[j] = null;
				d.getIngressos()[j] = d.getIngressos()[j + 1];
			}
			d.getIngressos()[d.getQtdIngressos()] = null;
			d.setQtdIngressos(d.getQtdIngressos() - 1);
			return true;
		}
	}

	/*
	 * Inserir e editar filme public boolean inserirEditarFilme(String[]
	 * dadosFilmes) { if (!dadosFilmes[1].matches("[0-9]+") ||
	 * !dadosFilmes[2].matches("[0-9]+") || !dadosFilmes[3].matches("[0-9]+") ||
	 * !dadosFilmes[4].matches("[0-9]+")) { return false; } else { Filme f = new
	 * Filme(Integer.parseInt(dadosFilmes[1]), dadosFilmes[2], dadosFilmes[3],
	 * Integer.parseInt(dadosFilmes[4]), dadosFilmes[5],
	 * Double.parseDouble(dadosFilmes[6]), Integer.parseInt(dadosFilmes[7]),
	 * dadosFilmes[8], dadosFilmes[9], Integer.parseInt(dadosFilmes[10]));
	 * d.inserirEditarFilme(f, Integer.parseInt(dadosFilmes[0])); return true; } }
	 * 
	 * // remover Filme public boolean removerFilme(int i) { String profRemovido =
	 * d.getFilmes()[i].getNomeFilme();
	 * 
	 * if(i == (d.getQtdFilmes() - 1)) { // O prof a ser removido está no final do
	 * array d.setQtdFilmes(d.getQtdFilmes() - 1); d.getFilmes()[d.getQtdFilmes()] =
	 * null; return true;
	 * 
	 * } else { // o prof a ser removido está no meio do array int cont = 0;
	 * while(d.getFilmes()[cont].getNomeFilme().compareTo(profRemovido) != 0)
	 * cont++; //Rotina swap for(int j = cont; j < d.getQtdFilmes() - 1; j++) {
	 * d.getFilmes()[j] = null; d.getFilmes()[j] = d.getFilmes()[j+1]; }
	 * d.getFilmes()[d.getQtdFilmes()] = null; d.setQtdFilmes(d.getQtdFilmes() - 1);
	 * return true; } } /** public boolean removerProfessor(int i) { if(i ==
	 * (d.getQtdFilmes() - 1)) { // O prof a ser removido está no final do array
	 * d.setQtdFilmes(d.getQtdFilmes() - 1); d.getFilmes()[d.getQtdFilmes()] = null;
	 * return true; } else { // o prof a ser removido está no meio do array int cont
	 * = 0; while(d.getFilmes()[cont].getNomeFilme().compareTo(filmeRemovido) != 0)
	 * cont++; //Rotina swap for(int j = cont; j < d.getQtdFilmes() - 1; j++) {
	 * d.getFilmes()[j] = null; d.getFilmes()[j] = d.getFilmes()[j+1]; }
	 * d.getFilmes()[d.getQtdFilmes()] = null; d.setQtdFilmes(d.getQtdFilmes() - 1);
	 * return true; }
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