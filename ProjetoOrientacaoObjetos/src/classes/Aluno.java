package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String numeroCpf;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public Aluno(String nome, int idade, String numeroCpf) {
		this.nome = nome;
		this.idade = idade;
		this.numeroCpf = numeroCpf;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public double getMediaNota() {

		double somaNotas = 0;

		for (Disciplina disciplina : disciplinas) {

			somaNotas += disciplina.getNotaDisciplina();

		}

		return somaNotas / disciplinas.size();

	}

	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 7) {
			return "Aprovado";

		} else if (media >= 5) {
			return "Recuperação";
		} else {
			return "Reprovado";
		}
	}

	

}
