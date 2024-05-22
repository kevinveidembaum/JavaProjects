package animalplanet;

public abstract class Animal {
    protected int idade, membros;
    protected float peso;
    
    
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    @Override
    public String toString() {
        return "idade = " + idade + ", membros = " + membros + ", peso = " + peso;
    }
    
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
