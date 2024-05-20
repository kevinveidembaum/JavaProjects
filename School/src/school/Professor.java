package school;

public class Professor extends Person{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aumento){
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Salario aumentou R$" + aumento);
        System.out.println("Salario atual: R$" + this.getSalario());
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
