package executavel;

import classes.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Joao");
		aluno1.setIdade(29);
		aluno1.setDataNascimento("09/02/1990");
		aluno1.setRegistroGeral("1324456643-4");
		aluno1.setNumeroCpf("15433234-65");
		aluno1.setDataMatricula("29/11/2025");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("José");
		aluno1.setNomeEscola("Coronel");
		aluno1.setSerieMatriculado("Terceiro");
		aluno1.setNota1(7);
		aluno1.setNota2(10);
		aluno1.setNota3(7);
		aluno1.setNota4(8);
		System.out.println(aluno1.getMediaNota());
		System.out.println(aluno1.getAlunoAprovadoBoolean());
		System.out.println(aluno1.getAlunoAprovadoString());
		
		
		
	}

}
