
public abstract class Cadastro {

	// Atributos
	private String nomeEspct;
	private String tipoEntrada;
	
	//Método constructor//
	
	public Cadastro(String espectador, String entrada) {
		setNomeEspct(espectador);
		setTipoEntrada(entrada);
	}
		
	// Get Set
	public String getNomeEspct() {
		return nomeEspct;
	}
	public void setNomeEspct(String nomeEspct) {
		this.nomeEspct = nomeEspct;
	}
	public String getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	
	

}
