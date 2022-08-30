public class Professor {

    private String nomeDoProfessor;
    private String horario;
    private String periodo;

    public Professor(String nomeDoProfessor, String horario, String periodo) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horario = horario;
        this.periodo = periodo;

    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public String getHorario() {
        return horario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
