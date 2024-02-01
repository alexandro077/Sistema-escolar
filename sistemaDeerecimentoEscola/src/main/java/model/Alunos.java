package model;

import java.util.List;

public class Alunos {
    private String nome;
    private int nota;
    private List<Double> matricula;

    public Alunos(String nome, int nota, Double matricula, String turma) {
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Matricula " + matricula);
    }

}

