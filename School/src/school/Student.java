package school;

public class Student extends Person {
    private String curso;
    private boolean matriculado;

    public void cancelarMatr(){
        this.matriculado = false;
        System.out.println("Matricula cancelada com sucesso!");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
}
