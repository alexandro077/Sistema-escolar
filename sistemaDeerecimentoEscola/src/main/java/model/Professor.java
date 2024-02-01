package model;

import java.util.List;

public class Professor {
    private String nome;
    private int id;
    private List<String> disciplina;

    public Professor(String nome, int id, String disciplina){
        System.out.println("Nome: " + nome);
        System.out.println("Identificação: " + id);
        System.out.println("Disciplina: " + disciplina);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<String> disciplina) {
        this.disciplina = disciplina;
    }


}
