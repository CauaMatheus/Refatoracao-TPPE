package modelo;

public abstract class Cadastro {

	// Atributos
	
	private int numSala;
	private String nomeFilme;
	private String horaFilme;
	
	
	// Construtor 
	
	public Cadastro(int numSala, String nomeFilme, String horaFilme) {
		this.setNumSala(numSala);
		this.setNomeFilme(nomeFilme);
		this.setHoraFilme(horaFilme);
	}
	
	// Get and Set
	
	public int getNumSala() {
		return numSala;
	}
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public String getHoraFilme() {
		return horaFilme;
	}
	public void setHoraFilme(String horaFilme) {
		this.horaFilme = horaFilme;
	}
	
	// M�todos //
	
	public void cad(){
		// Fun��o de cadastro
	}
	
	public void ed(){
		// Fun��o de edi��o
	}
	
	public void dell(){
		// Fun��o de delete
	}
	
	public void busc(){
		// Fun��o de busca
	}
	
	
	

}
