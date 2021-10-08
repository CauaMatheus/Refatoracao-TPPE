package control;

import modelo.Acompanhamento;
import modelo.Dados;
import modelo.Espectador;
import modelo.Filme;
import modelo.Ingresso;

public class ControleDados {
	private Dados d = new Dados();

	// chama método de criação de dados aleatórios
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

		/*
		 * if (!dadosFilmes[2].matches("[0-9]+") || !dadosFilmes[4].matches("[0-9]+") ||
		 * !dadosFilmes[6].matches("[0-9]+") || !dadosFilmes[7].matches("[0-9]+") ||
		 * !dadosFilmes[8].matches("[0-9]+") || !dadosFilmes[10].matches("[0-9]+")) {
		 * return false; } else {
		 */

		Filme f = new Filme(Integer.parseInt(dadosFilmes[1]), dadosFilmes[2], dadosFilmes[3],
				Integer.parseInt(dadosFilmes[4]), dadosFilmes[5], Double.parseDouble(dadosFilmes[6]),
				Integer.parseInt(dadosFilmes[7]), dadosFilmes[8], dadosFilmes[9], Integer.parseInt(dadosFilmes[10]));
		d.inserirEditarFilme(f, Integer.parseInt(dadosFilmes[0]));
		return true;

		// }
	}

	// remover Filme
	public boolean removerFilme(int i) {
		String filmeRemovido = d.getFilmes()[i].getNomeFilme();

		if (i == (d.getQtdFilmes() - 1)) { // Remover filme no final do Array
			d.setQtdFilmes(d.getQtdFilmes() - 1);
			d.getFilmes()[d.getQtdFilmes()] = null;
			return true;

		} else { // Remover filme no meio do Array
			int cont = 0;
			while (d.getFilmes()[cont].getNomeFilme().compareTo(filmeRemovido) != 0) {
				cont++;
			}
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
		if (!dadosIngressos[1].matches("[0-9]+") || !dadosIngressos[2].matches("[0-9]+")) {
			return false;
		} else {
			Ingresso in = new Ingresso(Integer.parseInt(dadosIngressos[1]), dadosIngressos[2], dadosIngressos[3],
					dadosIngressos[4], Integer.parseInt(dadosIngressos[5]), new Espectador(dadosIngressos[6]));
			d.inserirEditarIngresso(in, Integer.parseInt(dadosIngressos[0]));
			return true;
		}
	}

	// remover Ingresso
	public boolean removerIngresso(int i) {
		String inRemovido = d.getIngressos()[i].getNomeFilme();

		if (i == (d.getQtdIngressos() - 1)) { // Remover ingresso no final do Array
			d.setQtdIngressos(d.getQtdIngressos() - 1);
			d.getIngressos()[d.getQtdIngressos()] = null;
			return true;

		} else { // Remover ingresso no meio do Array
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

	// Inserir e editar Espectador
	public boolean inserirEditarEspectador(String[] dadosEspectadores) {
		Espectador e = new Espectador(dadosEspectadores[1], dadosEspectadores[2], dadosEspectadores[3]);
		d.inserirEditarEspectador(e, Integer.parseInt(dadosEspectadores[0]));
		return true;
	}

	// remover Espectador
	public boolean removerEspectador(int i) {
		String espcRemovido = d.getEspectadores()[i].getNome();

		if (i == (d.getQtdEspectadores() - 1)) { // Remover espectador no final do Array
			d.setQtdEspectadores(d.getQtdEspectadores() - 1);
			d.getEspectadores()[d.getQtdEspectadores()] = null;
			return true;

		} else { // Remover espectador no meio do Array
			int cont = 0;
			while (d.getEspectadores()[cont].getNome().compareTo(espcRemovido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdEspectadores() - 1; j++) {
				d.getEspectadores()[j] = null;
				d.getEspectadores()[j] = d.getEspectadores()[j + 1];
			}
			d.getEspectadores()[d.getQtdEspectadores()] = null;
			d.setQtdEspectadores(d.getQtdEspectadores() - 1);
			return true;
		}
	}

	// Inserir e editar acompanhamento
	public boolean inserirEditarAcompanhamento(String[] dadosAcomp) {
		/*
		 * if (!dadosFilmes[2].matches("[0-9]+") || !dadosFilmes[4].matches("[0-9]+")) {
		 * return false; } else {
		 */
		Acompanhamento a = new Acompanhamento(dadosAcomp[1], Double.parseDouble(dadosAcomp[2]),
				Integer.parseInt(dadosAcomp[3]), dadosAcomp[4]);
		d.inserirEditarAcompanhamento(a, Integer.parseInt(dadosAcomp[0]));
		return true;
		// }
	}

	// remover acompanhamento
	public boolean removerAcompanhamento(int i) {
		String acompanhentoRemovido = d.getAcompanhamentos()[i].getNome();

		if (i == (d.getQtdAcompanhamentos() - 1)) { // Remover acompanhamento no final do Array
			d.setQtdAcompanhamentos(d.getQtdAcompanhamentos() - 1);
			d.getAcompanhamentos()[d.getQtdAcompanhamentos()] = null;
			return true;

		} else { // Remover acompanhamento no meio do Array
			int cont = 0;
			while (d.getAcompanhamentos()[cont].getNome().compareTo(acompanhentoRemovido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdAcompanhamentos() - 1; j++) {
				d.getAcompanhamentos()[j] = null;
				d.getAcompanhamentos()[j] = d.getAcompanhamentos()[j + 1];
			}
			d.getAcompanhamentos()[d.getQtdAcompanhamentos()] = null;
			d.setQtdAcompanhamentos(d.getQtdAcompanhamentos() - 1);
			return true;
		}
	}
}