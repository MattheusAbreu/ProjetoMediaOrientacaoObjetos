package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

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
		
		int numeroMaterias = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de materias"));
		
		for (int i = 1 ; i <=numeroMaterias ; i++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: ");
			double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina de "+nomeDisciplina+" :"));
			Disciplina disciplina = new Disciplina(nomeDisciplina, notaDisciplina);
			aluno1.getDisciplinas().add(disciplina);
			
			
			
		}
		
		
		
		
		System.out.println(aluno1.getMediaNota());
		System.out.println(aluno1.getAlunoAprovadoBoolean());
		System.out.println(aluno1.getAlunoAprovadoString());

	}

}
