
///import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Os métodos construtores de todas as classes provam o correto funciomento de todos os gets e sets 
		// presentes na mesma, visto que o construtor atribui os valores dos atributos por meio dos gets and sets
		
		
		Filme f1 = new Filme(5, "Advengers", "16:00", 120, "Ação",25.50 , 14, "2d", "dublado",50);
		
		f1.exibir();
		
		Ingresso i1 = new Ingresso(5, "Advengers", "16:00", "Luiza", "Inteira");
		
		i1.exibir();
		
		Acompanhamento a1 = new Acompanhamento("Pipoca",5,"M","Salgado");
		
		a1.exibir();
		
		Espectador e1 = new Espectador("Luiza","31/07/98","75266597062","Pipoca");
		
		e1.exibir();
	}
	

}
