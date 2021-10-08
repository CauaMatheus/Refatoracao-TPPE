package PacoteTeste;
import control.ControleDados;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteDados {
	ControleDados c = new ControleDados();
	String dadosFilmes [];
	@Test
	void testInserirEditarFilme() {
		assertFalse(c.inserirEditarFilme(null));
		assertTrue(c.inserirEditarFilme(dadosFilmes));
	}

	@Test
	void testRemoverFilme() {
		assertFalse(c.removerFilme(6));
		assertTrue(c.removerFilme(1));
	}

	@Test
	void testRemoverEspectador() {
		assertFalse(c.removerEspectador(6));
		assertTrue(c.removerEspectador(1));
	}
}
