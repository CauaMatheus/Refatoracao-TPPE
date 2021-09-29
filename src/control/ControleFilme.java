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
		return qtdAlunos;
	}

	public void setQtd(int qtd) {
		this.qtdAlunos = qtd;
	}
	
	public String getNome(int i) {		
		return a[i].getNome();
	}
	
	public String getCPF(int i) {
		String numCPF = String.valueOf(a[i].getCPF());
		return numCPF;
	}
	
	public String getID(int i) {
		String numID = String.valueOf(a[i].getNumID());
		return numID;
	}
	
	public Telefone getTelefone(int i) {
		return a[i].getNumTel();
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	
	
	public String getEndereco(int i) {		
		return a[i].getEndereco();
	}	
}
