package classes;

public class Disciplina {

	private String nomeDisciplina;
	private double notaDisciplina;
	
	public Disciplina(String disciplina, double nota) {
		
		this.nomeDisciplina = disciplina;
		this.notaDisciplina = nota;
		
	}

	
	

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	} 

	public double getNotaDisciplina() {
		return this.notaDisciplina;
	}
	
	public void setNotaDisciplina(double notaDisciplina) {
		this.notaDisciplina = notaDisciplina;
	}

}
