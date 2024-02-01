package model;

public class Disciplina {
    private String disciplina;
    private String codigo;
    private String turma;


    public Disciplina(String disciplina, String codigo ){
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Codigo: " + codigo);
        System.out.println("Turma: " + turma);
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.disciplina = professorResponsavel;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}