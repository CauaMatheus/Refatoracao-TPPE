package interfac;
/**Cria a tela de menu
 * @version 1.0
 * @author Pedro V.
 * @since Out 2021
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ControleDados;

public class Menu implements ActionListener {

	// Criando paramentros paras as janelas

	private static JFrame janela = new JFrame("Menu Principal");
	private static JLabel titulo = new JLabel("Cinefun");
	private static JButton filme = new JButton("Filme");
	private static JButton expectadores = new JButton("Espectadores");
	private static JButton ingressos = new JButton("Ingressos");

	public static ControleDados dados = new ControleDados();

	public Menu() {

		// Determinando tamanho dos ícones

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(160, 10, 150, 50);
		filme.setBounds(95, 70, 200, 40);
		expectadores.setBounds(95, 125, 200, 40);
		ingressos.setBounds(95, 180, 200, 40);

		// Gerando janela com os parâmetros especificados

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(filme);
		janela.add(expectadores);
		janela.add(ingressos);

		// Determinando tamanho padrão da janela

		janela.setSize(400, 300);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		/**Contruct do menu, cria a tela de menu inserindo objetos e editando os mesmos
		 * @author Pedro V.
		 * @return tela de menu setada
		 */
	}

	public static void main(String[] args) {
		Menu menu = new Menu();

		filme.addActionListener(menu);
		expectadores.addActionListener(menu);
		ingressos.addActionListener(menu);
	}

	@Override
	public void actionPerformed(ActionEvent acao) {

		// Disparando ações para o mesmo

		Object src = acao.getSource();

		if (src == filme)
			new TelaFilme().mostrarDados(dados, 1);

		if (src == expectadores)
			new TelaFilme().mostrarDados(dados, 2);

		if (src == ingressos)
			new TelaFilme().mostrarDados(dados, 3);
		
		/**Método que executa uma açãp de acordo com o evento escutado
		 * @author Pedro V.
		 * @param acao ActionEvent - Ação escutada pelo ActionListener
		 */

	}
}
