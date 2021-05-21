
public class Professor extends Pessoa {
	
	private Integer numCursos;
	private String cursos;
	
	public Professor(String nome, String endereço, Integer numCursos, String cursos) {
		super(nome, endereço);
		this.numCursos = numCursos;
		this.cursos = cursos;
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

	
	@Override
	public String toString() {
		return "Professor [numCursos=" + numCursos + ", cursos=" + cursos + "]";
	}
	
	
}
