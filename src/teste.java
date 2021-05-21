import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class teste {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Estudante("Rodrigo Wallace", "Rua tal", 1, "Programação", 9)); 
		pessoas.add(new Estudante("William Aquino", "Rua fulano", 1, "Redes de computadores", 7));
		
		pessoas.add(new Professor("Mafra", "Rua isso", 2, "Programação, Redes de computadores"));
		pessoas.add(new Professor("Sidney", "Rua aquilo", 2, "Programação, Redes de computadores"));
		
		
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

		
	}

}
