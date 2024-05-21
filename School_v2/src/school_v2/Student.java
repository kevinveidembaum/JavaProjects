package school_v2;

public class Student extends Person {
    private String curso;
    private int matricula;
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso!");
        System.out.println("Obrigado " + this.nome);
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", sexo = " + sexo + ", idade = " + idade + ",\n curso=" + curso + ", matricula=" + matricula;
    }
    
    
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}
