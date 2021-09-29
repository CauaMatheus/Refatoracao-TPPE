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
	
	public int getQntFilmes() {
		return this.getQntFilmes();
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
	/*
	public boolean inserirEditarFilme(String[] dadosProfs) {
		if(!dadosProfs[3].matches("[0-9]+") || !dadosProfs[4].matches("[0-9]+") || 
				!dadosProfs[5].matches("[0-9]+") || !dadosProfs[6].matches("[0-9]+")) {
			return false;
		} else {
				Professor p = new Professor(dadosProfs[1], Double.parseDouble(dadosProfs[2]), 
						Integer.parseInt(dadosProfs[3]), Integer.parseInt(dadosProfs[4]), 
						new Telefone(Integer.parseInt(dadosProfs[5]), Integer.parseInt(dadosProfs[6])));
				d.inserirEditaProf(p, Integer.parseInt(dadosProfs[0]));
				return true;
		}

	*/
	
}