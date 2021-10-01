package modelo;

public class Dados {

	private Filme[] filmes = new Filme[50];
	private int qtdFilmes = 0;

	private Ingresso[] ingressos = new Ingresso[50];
	private int qtdIngressos = 0;

	private Espectador[] espectadores = new Espectador[50];
	private int qtdEspectadores = 0;

	private Acompanhamento[] acompanhamentos = new Acompanhamento[50];
	private int qtdAcompanhamentos = 0;

	public void fillWithSomeData() {

		for (int i = 0; i < 3; i++) {
			filmes[i] = new Filme(i + 5, "Advengers-" + i, "16:00", 120, "Ação", 25.50, 14, "2d", "dublado", 50);

			ingressos[i] = new Ingresso(i, "Advengers", "16:00", "Inteira", i + 2);

			espectadores[i] = new Espectador("Luiza", "31/07/9" + i, "75266597062");

			acompanhamentos[i] = new Acompanhamento("Pipoca", i, "M", "Salgado");

		}

		qtdFilmes = 3;
		qtdIngressos = 3;
		qtdEspectadores = 3;
		qtdAcompanhamentos = 3;
	}

	public Filme[] getFilmes() {
		return filmes;
	}

	public void setFilmes(Filme[] filmes) {
		this.filmes = filmes;
	}

	public void inserirEditarFilme(Filme f, int pos) {
		this.filmes[pos] = f;
		if (pos == qtdFilmes)
			qtdFilmes++;
	}

	public int getQtdFilmes() {
		return qtdFilmes;
	}

	public void setQtdFilmes(int qtdFilmes) {
		this.qtdFilmes = qtdFilmes;
	}

	public Ingresso[] getIngressos() {
		return ingressos;
	}

	public void setIngressos(Ingresso[] ingressos) {
		this.ingressos = ingressos;
	}

	public void inserirEditarIngresso(Ingresso i, int pos) {
		this.ingressos[pos] = i;
		if (pos == qtdIngressos)
			qtdIngressos++;
	}

	public int getQtdIngressos() {
		return qtdIngressos;
	}

	public void setQtdIngressos(int qtdIngressos) {
		this.qtdIngressos = qtdIngressos;
	}

	public Espectador[] getEspectadores() {
		return espectadores;
	}

	public void setEspectadores(Espectador[] espectadores) {
		this.espectadores = espectadores;
	}

	public void inserirEditarEspectador(Espectador e, int pos) {
		this.espectadores[pos] = e;
		if (pos == qtdEspectadores)
			qtdEspectadores++;
	}

	public int getQtdEspectadores() {
		return qtdEspectadores;
	}

	public void setQtdEspectadores(int qtdEspectadores) {
		this.qtdEspectadores = qtdEspectadores;
	}

	public Acompanhamento[] getAcompanhamentos() {
		return acompanhamentos;
	}

	public void setAcompanhamentos(Acompanhamento[] acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}

	public void inserirEditarAcompanhamento(Acompanhamento a, int pos) {
		this.acompanhamentos[pos] = a;
		if (pos == qtdAcompanhamentos)
			qtdAcompanhamentos++;
	}

	public int getQtdAcompanhamentos() {
		return qtdAcompanhamentos;
	}

	public void setQtdAcompanhamentos(int qtdAcompanhamentos) {
		this.qtdAcompanhamentos = qtdAcompanhamentos;
	}

}
