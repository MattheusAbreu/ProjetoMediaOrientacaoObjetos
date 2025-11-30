package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class Main {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		int quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos que serão cadastrados: "));

		for (int i = 1; i <= quantidadeAlunos; i++) {

			String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno");
			String cpfAluno = JOptionPane.showInputDialog("Digite o numero do CPF do aluno");
			int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno"));

			Aluno aluno1 = new Aluno(nomeAluno, idadeAluno, cpfAluno);

			int numeroMaterias = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de disciplinas que o aluno possui"));

			for (int j = 1; j <= numeroMaterias; j++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: ");
				double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina de " + nomeDisciplina + " :"));
				Disciplina disciplina = new Disciplina(nomeDisciplina, notaDisciplina);
				aluno1.getDisciplinas().add(disciplina);

			}

			System.out.println(aluno1.getMediaNota());
			System.out.println(aluno1.getAlunoAprovado());

			int escolha = JOptionPane.showConfirmDialog(null, "Gostaria de apagar alguma materia?");

			if (escolha == 0) {

				int continuarApagando = 0;

				while (continuarApagando == 0) 
				{
					System.out.println("\n");
					
					for (int index = 0; index < aluno1.getDisciplinas().size(); index++) 
					{
						System.out.println(aluno1.getDisciplinas().get(index).getNomeDisciplina() + " - ID " + (index + 1));
				    }
					
					int materiaApagada = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o ID da materia a ser apagada: "));
					JOptionPane.showMessageDialog(null,aluno1.getDisciplinas().get(materiaApagada - 1).getNomeDisciplina() + " apagada.");		
					aluno1.getDisciplinas().remove(materiaApagada - 1);

					continuarApagando = (JOptionPane.showConfirmDialog(null, "Deseja apagar mais alguma materia?"));

				}
			}

			for (Disciplina disciplinaNome : aluno1.getDisciplinas()) {
				System.out.println(disciplinaNome.getNomeDisciplina());
			}
			alunos.add(aluno1);
		}

	}
}
