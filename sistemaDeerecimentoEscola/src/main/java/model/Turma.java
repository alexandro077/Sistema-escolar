package model;

public class Turma {

    private String turmas;


       public Turma( String turmas){
                System.out.println("Turma: " + turmas);
    }


    public String getTurmas() {
        return turmas;
    }

    public void setTurmas(String turmas) {
        this.turmas = turmas;
    }

}
