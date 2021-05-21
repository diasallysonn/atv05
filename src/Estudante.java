
public class Estudante extends Pessoa {
	
	private Integer numCursos;
	private String cursos;
	private Integer notas;
	
	public Estudante(String nome, String endereço, Integer numCursos, String cursos, Integer notas) {
		super(nome, endereço);
		this.numCursos = numCursos;
		this.cursos = cursos;
		this.notas = notas;
	}

	public Integer getNumCursos() {
		return numCursos;
	}

	public void setNumCursos(Integer numCursos) {
		this.numCursos = numCursos;
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public Integer getNotas() {
		return notas;
	}

	public void setNotas(Integer notas) {
		this.notas = notas;
	}

	
	@Override
	public String toString() {
		return "Estudante [numCursos=" + numCursos + ", cursos=" + cursos + ", notas=" + notas + "]";
	}
	
	
}
