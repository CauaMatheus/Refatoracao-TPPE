package control;
import modelo.*;
public class ControleFilme {

	// Array para guardar filmes
	
	private Filme[]f;
	private int QntFilmes;
	
	public ControleFilme(ControleDados d) {
		f = d.getFilmes();
		QntFilmes = d.getQntFilmes();
	}
	
	public String[] getNomeFilme() {
		String[] s = new String[QntFilmes];
		for(int i = 0; i < QntFilmes; i++) {
			s[i] = f[i].getNomeFilme();
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
	
	
	
	
	
	
	
	
}





















