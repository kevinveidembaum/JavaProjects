package school_v2;

public class Professor extends Person{
    private String especialidade;
    private float salario;
    
    public Professor(){
        this.salario = 1500;
    }
    
    public void receberAumento(float aumento){
        this.salario += aumento;
        System.out.println("Salario aumentou para "+this.salario);
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
