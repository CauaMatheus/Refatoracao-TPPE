package control;

import modelo.Espectador;

public class ControleEspectador {

	// Array para guardar Espectador

	private Espectador[] e;
	private int QntEspectadores;

	public ControleEspectador(ControleDados d) {
		e = d.getEspectadores();
		QntEspectadores = d.getQntEspectadores();
	}

	public String[] getNome() {
		String[] s = new String[QntEspectadores];
		for (int i = 0; i < QntEspectadores; i++) {
			s[i] = e[i].getNome();
		}

		return s;
	}

	public int getQtd() {
		return QntEspectadores;
	}

	public void setQtd(int qtd) {
		this.QntEspectadores = qtd;
	}

	public void setQtdEspectador(int QntEspectadores) {
		this.QntEspectadores = QntEspectadores;
	}

	public String getNome(int i) {
		return e[i].getNome();
	}

	public String getNasc(int i) {
		return e[i].getNasc();
	}

	public String getCpf(int i) {
		return e[i].getCpf();
	}

}
