package principal;

import model.*;

public class AppEscola {
    public static void main(String[] args) {
        Escola minhaEscola = new Escola();
        Alunos aluno1 = new Alunos("Alexandro",900,1.2345,"701");
        Professor professor1 = new Professor("Luis",900,"Geografia");
        Disciplina disciplina1 = new Disciplina("Geografia","900");
       Turma turma1 = new Turma("701");
        minhaEscola.matricularAluno(aluno1);
        minhaEscola.contratarProfessor(professor1);
        minhaEscola.atribuirProfessorDisciplina(professor1, disciplina1);

        //Exemplo de exibição de informações
        System.out.println("Disciplinas ofertadas: " + minhaEscola.getDisciplinas());
        System.out.println("Quantidades de turmas: " + minhaEscola.getTurmas());

    }
}
