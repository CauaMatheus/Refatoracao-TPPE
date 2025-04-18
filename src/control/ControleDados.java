package control;


import modelo.Acompanhamento;
import modelo.Dados;
import modelo.Espectador;
import modelo.Filme;
import modelo.Ingresso;

/**Controla os dados que irão entrar nos arrays
 * @version 1.0
 * @author Pablo C, Pedro V.
 * @since Out 2021
 */
public class ControleDados {
	private Dados d = new Dados();

	// chama método de criação de dados aleatórios
	/**
	 * 
	 */
	public ControleDados() {
		d.fillWithSomeData();
	}

	/**
	 * @return a
	 */
	public Dados getDados() {
		return d;
	}

	/**
	 * @param d a
	 */
	public void setDados(Dados d) {
		this.d = d;
	}

	/**
	 * @return s
	 */
	public Filme[] getFilmes() {
		return this.d.getFilmes();
	}

	/**
	 * @return s
	 */
	public int getQtdFilmes() {
		return this.d.getQtdFilmes();
	}

	/**
	 * @return s
	 */
	public Ingresso[] getIngressos() {
		return this.d.getIngressos();
	}

	/**
	 * @return s
	 */
	public int getQntIngressos() {
		return this.d.getQtdIngressos();
	}

	/**
	 * @return s
	 */
	public Espectador[] getEspectadores() {
		return this.d.getEspectadores();
	}

	/**
	 * @return s
	 */
	public int getQntEspectadores() {
		return this.d.getQtdEspectadores();
	}

	/**
	 * @return s
	 */
	public Acompanhamento[] getAcompanhamentos() {
		return this.d.getAcompanhamentos();
	}

	/**
	 * @return s
	 */
	public int getQntAcompanhamentos() {
		return this.d.getQtdAcompanhamentos();
	}

	// Inserir e editar filme
	
	/**
	 * Método para inserir os dados de Filme no array
	 * 
	 * @author Pablo C.
	 * @param dadosFilmes String[] - String que irá repassar os dados para o array
	 * @return true - Quando o dado é devidamente inserido
	 */
	public boolean inserirEditarFilme(String[] dadosFilmes) {

		if (!dadosFilmes[2].matches("[0-9]+") || !dadosFilmes[4].matches("[0-9]+") || !dadosFilmes[6].matches("[0-9]+")
				|| !dadosFilmes[7].matches("[0-9]+") || !dadosFilmes[8].matches("[0-9]+")
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
	/**
	 * Método para excluir os dados de um filme
	 * 
	 * @author Pablo C.
	 * @param i int - Variável de posição do filme a ser removido
	 * @return true - Quando o dado é devidamente removido
	 */
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
	/**
	 * Método para inserir os dados de Ingresso no array
	 * 
	 * @author Pedro V.
	 * @param dadosIngressos String[] - String que irá repassar os dados para o
	 *                       array
	 * @return true - Quando o dado é devidamente inserido
	 */
	public boolean inserirEditarIngresso(String[] dadosIngressos) {
		if (!dadosIngressos[6].matches("[0-9]+") || !dadosIngressos[5].matches("[0-9]+")) {
			return false;
		} else {
			Ingresso in = new Ingresso(dadosIngressos[1], dadosIngressos[2], dadosIngressos[3], dadosIngressos[4],
					Integer.parseInt(dadosIngressos[5]), Integer.parseInt(dadosIngressos[6]));
			d.inserirEditarIngresso(in, Integer.parseInt(dadosIngressos[0]));
			return true;
		}

	}

	// remover Ingresso
	/**
	 * Método para excluir os dados de um ingresso
	 * 
	 * @author Pedro V.
	 * @param i int - Variável de posição do ingresso a ser removido
	 * @return true - Quando o dado é devidamente removido
	 */
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
	/**
	 * Método para inserir os dados de Espectador no array
	 * 
	 * @author Pedro V.
	 * @param dadosEspectadores String[] - String que irá repassar os dados para o
	 *                          array
	 * @return true - Quando o dado é devidamente inserido
	 */
	public boolean inserirEditarEspectador(String[] dadosEspectadores) {
		Espectador e = new Espectador(dadosEspectadores[1], dadosEspectadores[2], dadosEspectadores[3]);
		d.inserirEditarEspectador(e, Integer.parseInt(dadosEspectadores[0]));
		return true;

	}

	// remover Espectador
	/**
	 * Método para excluir os dados de um espectador
	 * 
	 * @author Pedro V.
	 * @param i int - Variável de posição do espectador a ser removido
	 * @return true - Quando o dado é devidamente removido
	 */
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
	/**
	 * Método para inserir os dados de Espectador no array
	 * 
	 * @author Pablo C.
	 * @param dadosAcomp String[] - String que irá repassar os dados para
	 *                             o array
	 * @return true - Quando o dado é devidamente inserido
	 */
	public boolean inserirEditarAcompanhamento(String[] dadosAcomp) {
		if (!dadosAcomp[2].matches("[0.0-9.0]+") || !dadosAcomp[3].matches("[0-9]+")) {
			return false;
		} else {

			Acompanhamento a = new Acompanhamento(dadosAcomp[1], Double.parseDouble(dadosAcomp[2]),
					Integer.parseInt(dadosAcomp[3]), dadosAcomp[4]);
			d.inserirEditarAcompanhamento(a, Integer.parseInt(dadosAcomp[0]));
			return true;
		}

	}

	// remover acompanhamento
	/**
	 * Método para excluir os dados de um acompanhamento
	 * 
	 * @author Pablo C.
	 * @param i int - Variável de posição do acompanhamento a ser removido
	 * @return true - Quando o dado é devidamente removido
	 */
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