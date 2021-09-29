package control;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();

	

	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}
	
	public Filme[] getFilmes() {
		return this.d.getFilmes();
	}
}