package model;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Alunos> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;

    public Escola(){
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public void matricularAluno(Alunos alunos){
        this.alunos.add(alunos);
    }
    public void contratarProfessor(Professor professor){
        this.professores.add(professor);
    }


    public List<Alunos> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void atribuirProfessorDisciplina(Professor professor1, Disciplina disciplina1) {

    }
    //Outras funcionalidades podem ser adicionadas conforme necessário
}
